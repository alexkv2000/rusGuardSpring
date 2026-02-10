package com.rusguard.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.naming.Context;
import javax.naming.directory.InitialDirContext;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

@Configuration
public class SecurityConfig {
    @Value("${ad.domain}")
    private String domain;

    @Value("${ad.url}")
    private String url;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        // Разрешаем доступ без аутентификации к статическим ресурсам
                        .requestMatchers(
                                "/login.html",           // Страница логина
                                "/api/ad/**",       // Все эндпоинты для тестирования AD
                                "/css/**",               // CSS файлы
                                "/js/**",               // JavaScript файлы
                                "/images/**"             // Изображения
                        ).permitAll()
                        .anyRequest().authenticated() // Все остальное требует аутентификации
                )
                .formLogin(form -> form
                        .loginPage("/login.html")
                        .loginProcessingUrl("/api/auth/login")
                        .defaultSuccessUrl("/index.html", true)
                        .failureUrl("/login.html?error=true")
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/api/auth/logout")
                        .logoutSuccessUrl("/login.html?logout=true")
                        .permitAll()
                )
                .csrf(csrf -> csrf.disable());

        return http.build();
    }

    @Bean
    public CustomLdapAuthenticationProvider customLdapAuthenticationProvider() {
        // Проверяем, что параметры AD загружены
        if (domain == null || domain.isEmpty() || url == null || url.isEmpty()) {
            throw new IllegalStateException("Параметры AD не настроены. Проверьте application.properties");
        }

        return new CustomLdapAuthenticationProvider(domain, url);
    }

    @Bean
    public AuthenticationManager authenticationManager(
            CustomLdapAuthenticationProvider customLdapAuthenticationProvider) {
        return new ProviderManager(Arrays.asList(customLdapAuthenticationProvider));
    }

    // Кастомный провайдер
    public static class CustomLdapAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
        private final String domain;
        private final String url;

        public CustomLdapAuthenticationProvider(String domain, String url) {
            this.domain = domain;
            this.url = url;
        }

        @Override
        protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                      UsernamePasswordAuthenticationToken authentication)
                throws AuthenticationException {
            // Здесь мы пробуем bind с разными форматами principal, как в тестовом коде
            String username = authentication.getName();
            String password = (String) authentication.getCredentials();

            // Пробуем разные форматы имени пользователя (как в тестовом)
            String[] principalFormats = {
//                    username + "@" + domain.toLowerCase(),
                    domain + "\\" + username,
                    username
            };

            Hashtable<String, String> env = new Hashtable<>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, url);
            env.put(Context.SECURITY_AUTHENTICATION, "simple");
            // Ключевая настройка для обхода требований подписи (может не сработать)
            env.put("com.sun.jndi.ldap.tls.require", "false");

            boolean success = false;
            Exception lastException = null;

            for (String principal : principalFormats) {
                env.put(Context.SECURITY_PRINCIPAL, principal);
                env.put(Context.SECURITY_CREDENTIALS, password);

                try {
                    // Пытаемся создать контекст (выполнить bind)
                    new InitialDirContext(env);
                    success = true;
                    break; // Останавливаемся при первой успешной попытке
                } catch (Exception e) {
                    lastException = e;
                    // Логируем ошибки, как в тестовом коде
                    System.out.println("❌ Ошибка для principal '" + principal + "': " + e.getClass().getSimpleName());
                    System.out.println("   Сообщение: " + e.getMessage());
                    Throwable cause = e.getCause();
                    while (cause != null) {
                        System.out.println("   Причина: " + cause.getMessage());
                        cause = cause.getCause();
                    }
                }
            }

            if (!success) {
                throw new org.springframework.security.authentication.BadCredentialsException(
                        "Не удалось аутентифицировать с ни одним форматом principal. Последняя ошибка: " +
                                (lastException != null ? lastException.getMessage() : "Неизвестная ошибка"));
            }
        }

        @Override
        protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
                throws AuthenticationException {
            // Возвращаем минимальный UserDetails (поскольку bind уже прошёл)
            String pass = (String) authentication.getCredentials();
            return new org.springframework.security.core.userdetails.User(
                    username, pass, List.of(new SimpleGrantedAuthority("ROLE_USER")));
        }
    }
}