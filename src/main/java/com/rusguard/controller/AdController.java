package com.rusguard.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/ad")
public class AdController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Value("${ad.domain:not-configured}")
    private String adDomain;

    @Value("${ad.url:not-configured}")
    private String adUrl;

    // 1. Проверка конфигурации AD
    @GetMapping("/config")
    public Map<String, Object> getAdConfig() {
        Map<String, Object> config = new HashMap<>();
        config.put("adDomain", adDomain);
        config.put("adUrl", adUrl);

        // Исправлено: проверяем, сконфигурирован ли AD
        boolean isConfigured = !adDomain.equals("not-configured") && !adUrl.equals("not-configured");
        config.put("configured", isConfigured);
        config.put("message", isConfigured ? "AD настроен" : "AD не настроен - проверьте application.properties");

        // Проверка, какой провайдер используется
        config.put("authManagerType", authenticationManager.getClass().getSimpleName());

        return config;
    }

    // 2. Тестирование подключения к AD
    @PostMapping("/connection")
    public Map<String, Object> testAdConnection(@RequestBody AuthRequest request) {
        Map<String, Object> result = new HashMap<>();

        try {
            // Пробуем аутентифицировать
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.username, request.password)
            );

            // Если успешно - устанавливаем сессию
            SecurityContextHolder.getContext().setAuthentication(authentication);

            result.put("success", true);
            result.put("message", "Успешное подключение к Active Directory!");
            result.put("user", authentication.getName());
            result.put("authorities",
                    authentication.getAuthorities().stream()
                            .map(GrantedAuthority::getAuthority)
                            .collect(Collectors.toList()));

        } catch (AuthenticationException e) {
            result.put("success", false);
            result.put("message", "Ошибка подключения к AD");
            result.put("error", e.getMessage());
            result.put("errorType", e.getClass().getSimpleName());

            // Детальная диагностика
            if (e.getMessage() != null) {
                if (e.getMessage().contains("Bind")) {
                    result.put("diagnostic", "Проблема с аутентификацией (неверный логин/пароль)");
                } else if (e.getMessage().contains("Connect") || e.getMessage().contains("Timeout")) {
                    result.put("diagnostic", "Проблема с подключением к серверу (неверный URL/порт)");
                } else if (e.getMessage().contains("Search")) {
                    result.put("diagnostic", "Проблема с поиском пользователя (неверный фильтр)");
                }
            }
        }

        return result;
    }

    // 3. Информация о текущей сессии
    @GetMapping("/session-info")
    public Map<String, Object> getSessionInfo() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Map<String, Object> info = new HashMap<>();

        if (auth != null && auth.isAuthenticated() &&
                !"anonymousUser".equals(auth.getPrincipal())) {
            info.put("authenticated", true);
            info.put("username", auth.getName());
            info.put("authorities",
                    auth.getAuthorities().stream()
                            .map(GrantedAuthority::getAuthority)
                            .collect(Collectors.toList()));
            info.put("authType", auth.getClass().getSimpleName());
        } else {
            info.put("authenticated", false);
            info.put("message", "Не аутентифицирован");
        }

        return info;
    }

    // 4. Простой тест доступности
    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Map.of(
                "status", "UP",
                "service", "AD Test Controller",
                "timestamp", String.valueOf(System.currentTimeMillis())
        );
    }
    
    // 5. Проверка принадлежности к группе "Администратор"
    @PostMapping("/check-admin-group")
    public Map<String, Object> checkAdminGroup(@RequestBody AuthRequest request) {
        Map<String, Object> result = new HashMap<>();
        
        try {
            // Сначала проверяем аутентификацию
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.username, request.password)
            );
            
            // Если аутентификация успешна, проверяем принадлежность к группе
            boolean isAdmin = checkUserInAdminGroup(request.username, request.password);
            
            result.put("authenticated", true);
            result.put("username", request.username);
            result.put("isAdmin", isAdmin);
            
        } catch (AuthenticationException e) {
            result.put("authenticated", false);
            result.put("error", "Ошибка аутентификации");
        }
        
        return result;
    }
    
    // Метод для проверки принадлежности к группе "Администратор" через API
    @GetMapping("/is-admin")
    public Map<String, Object> isAdmin() {
        Map<String, Object> result = new HashMap<>();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        
        if (auth != null && auth.isAuthenticated() &&
            !auth.getPrincipal().toString().equals("anonymousUser")) {
            // Проверяем, является ли пользователь администратором
            String username = auth.getName();
            try {
                boolean isAdmin = checkUserInAdminGroup(username, "");
                result.put("isAdmin", isAdmin);
                result.put("username", username);
                result.put("authenticated", true);
            } catch (Exception e) {
                result.put("isAdmin", false);
                result.put("error", "Ошибка проверки группы");
            }
        } else {
            result.put("authenticated", false);
            result.put("isAdmin", false);
        }
        
        return result;
    }
    
    /**
     * Проверяет, принадлежит ли пользователь к группе "Администратор"
     * @param username имя пользователя
     * @param password пароль пользователя
     * @return true если пользователь в группе "Администратор"
     */
    private boolean checkUserInAdminGroup(String username, String password) {
        try {
            // Создаем LDAP контекст
            Hashtable<String, String> env = new Hashtable<>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, adUrl);
            env.put(Context.SECURITY_AUTHENTICATION, "simple");
            env.put(Context.SECURITY_PRINCIPAL, adDomain + "\\" + username);
            env.put(Context.SECURITY_CREDENTIALS, password);
            
            // Пытаемся выполнить bind с учетными данными пользователя
            DirContext ctx = new InitialDirContext(env);
            
            // Получаем информацию о пользователе
            String userDN = getUserDN(ctx, username);
            if (userDN == null) {
                ctx.close();
                return false;
            }
            
            // Проверяем членство в группе "Администратор"
            boolean isAdmin = checkUserInGroup(ctx, userDN, "Администратор");
            
            ctx.close();
            return isAdmin;
            
        } catch (Exception e) {
            System.err.println("Ошибка проверки группы пользователя: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Получает DN пользователя по его имени
     */
    private String getUserDN(DirContext ctx, String username) throws NamingException {
        SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
        searchControls.setReturningAttributes(new String[]{"dn"});
        
        String searchFilter = "(&(objectClass=user)(sAMAccountName=" + username + "))";
        NamingEnumeration<SearchResult> results = ctx.search("", searchFilter, searchControls);
        
        if (results.hasMore()) {
            SearchResult result = results.next();
            return result.getNameInNamespace();
        }
        
        return null;
    }
    
    /**
     * Проверяет, состоит ли пользователь в указанной группе
     */
    private boolean checkUserInGroup(DirContext ctx, String userDN, String groupName) throws NamingException {
        SearchControls searchControls = new SearchControls();
        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
        
        // Ищем группу по имени
        String groupFilter = "(&(objectClass=group)(cn=" + groupName + "))";
        NamingEnumeration<SearchResult> groupResults = ctx.search("", groupFilter, searchControls);
        
        if (groupResults.hasMore()) {
            SearchResult groupResult = groupResults.next();
            String groupDN = groupResult.getNameInNamespace();
            
            // Проверяем, есть ли пользователь в этой группе
            String memberFilter = "(&(objectClass=*)(memberOf=" + groupDN + "))";
            NamingEnumeration<SearchResult> memberResults = ctx.search("", memberFilter, searchControls);
            
            while (memberResults.hasMore()) {
                SearchResult memberResult = memberResults.next();
                if (memberResult.getNameInNamespace().equalsIgnoreCase(userDN)) {
                    return true;
                }
            }
        }
        
        return false;
    }
//
    // 5. Логин через форму (простой вариант)
    @PostMapping("/simple-login")
    public Map<String, Object> simpleLogin(
            @RequestParam String username,
            @RequestParam String password) {

        Map<String, Object> result = new HashMap<>();

        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );

            SecurityContextHolder.getContext().setAuthentication(authentication);

            result.put("success", true);
            result.put("user", authentication.getName());

        } catch (AuthenticationException e) {
            result.put("success", false);
            result.put("error", e.getMessage());
        }

        return result;
    }

    // DTO для запроса аутентификации
    public static class AuthRequest {
        private String username;
        private String password;

        // Геттеры и сеттеры
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}