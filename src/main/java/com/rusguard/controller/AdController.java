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

import java.util.HashMap;
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