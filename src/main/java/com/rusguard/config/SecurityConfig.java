package com.rusguard.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import waffle.servlet.NegotiateSecurityFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private NegotiateSecurityFilter waffleFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // 1. Отключаем CSRF
                .csrf().disable()

                // 2. Настраиваем доступ
                .authorizeRequests()
                // Разрешаем доступ статики и swagger (если нужно)
                .antMatchers("/swagger-ui/**", "/v3/api-docs/**").permitAll()
                // Все остальные запросы требуют аутентификации
                .anyRequest().authenticated()
                .and()

                // 3. Добавляем Waffle Filter
                .addFilterBefore(waffleFilter, UsernamePasswordAuthenticationFilter.class)

                // 4. Добавляем наш "Мостик" (WaffleToSpringSecurityFilter) ПОСЛЕ Waffle
                // Он перенесет данные из request в SecurityContext
                .addFilterAfter(new WaffleToSpringSecurityFilter(), NegotiateSecurityFilter.class)

                // 5. Отключаем стандартные формы логина
                .formLogin().disable()
                .httpBasic().disable();
    }
}

//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.ProviderManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//
//import javax.naming.Context;
//import javax.naming.directory.InitialDirContext;
//import java.util.Arrays;
//import java.util.Hashtable;
//import java.util.List;
//import java.util.Objects;
//
//@Configuration
//public class SecurityConfig {
//    @Value("${ad.domain}")
//    private String domain;
//
//    @Value("${ad.url}")
//    private String url;
//    // Внедряем список пользователей. Если настройки нет, берем пустую строку
//    @Value("${app.security.allowed-users:}")
//    private String allowedUsersConfig;
//    @Bean
//    public CorsFilter corsFilter() {
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOriginPattern("*");
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config);
//
//        return new CorsFilter(source);
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authz -> authz
//                        // Разрешаем доступ без аутентификации к статическим ресурсам
//                        .requestMatchers(
//                                "/login.html",           // Страница логина
//                                "/api/ad/**",       // Все эндпоинты для тестирования AD
//                                "/css/**",               // CSS файлы
//                                "/js/**",               // JavaScript файлы
//                                "/images/**",             // Изображения
//                                // Все пути Swagger UI и OpenAPI
//                                "/swagger-ui/**",
//                                "/swagger-ui.html",
//                                "/v3/api-docs/**",
//                                "/swagger-resources/**",
//                                "/swagger-resources",
//                                "/webjars/**",
//                                "/configuration/ui",
//                                "/configuration/security",
//
//                                // Пути для Springdoc OpenAPI (если используется)
//                                "/api-docs/**",
//                                "/api-docs",
//                                "/api/terms",
//                                "/api/license",
//                                "/api/health",
//                                "/api/actuator/**",
//
//                                // Пути для Swagger UI index
//                                "/swagger-ui/index.html"
//                        ).permitAll()
//                        .anyRequest().authenticated() // Все остальное требует аутентификации
//                )
//                .formLogin(form -> form
//                        .loginPage("/login.html")
//                        .loginProcessingUrl("/api/auth/login")
//                        .defaultSuccessUrl("/index.html", true)
//                        .failureUrl("/login.html?error=true")
//                        .permitAll()
//                )
//                .logout(logout -> logout
//                        .logoutUrl("/api/auth/logout")
//                        .logoutSuccessUrl("/login.html?logout=true")
//                        .permitAll()
//                )
//                .csrf(csrf -> csrf.disable());
//
//        return http.build();
//    }
//
//    @Bean
//    public CustomLdapAuthenticationProvider customLdapAuthenticationProvider() {
//        // Проверяем, что параметры AD загружены
//        if (domain == null || domain.isEmpty() || url == null || url.isEmpty()) {
//            throw new IllegalStateException("Параметры AD не настроены. Проверьте application.properties");
//        }
//
//        return new CustomLdapAuthenticationProvider(domain, url);
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(
//            CustomLdapAuthenticationProvider customLdapAuthenticationProvider) {
//        return new ProviderManager(Arrays.asList(customLdapAuthenticationProvider));
//    }
//
//    // Кастомный провайдер
//    public static class CustomLdapAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
//        private final String domain;
//        private final String url;
//
//        public CustomLdapAuthenticationProvider(String domain, String url) {
//            this.domain = domain;
//            this.url = url;
//        }
//
//        @Override
//        protected void additionalAuthenticationChecks(UserDetails userDetails,
//                                                      UsernamePasswordAuthenticationToken authentication)
//                throws AuthenticationException {
//
//            // 1. Извлекаем креды
//            String password = (String) authentication.getCredentials();
//
//            // 2. ЯВНАЯ ПРОВЕРКА: Пароль не должен быть null или пустым
//            if (password == null || password.trim().isEmpty()) {
//                // Логируем попытку входа с пустым паролем (желательно через нормальный логгер, а не System.out)
//                // System.out.println("Попытка входа с пустым паролем для пользователя: " + authentication.getName());
//
//                // Выбрасываем исключение. Spring Security перехватит его и отправит на failureUrl
//                throw new org.springframework.security.authentication.BadCredentialsException(
//                        "Пароль не может быть пустым (additionalAuthenticationChecks)");
//            }
//
//
//            // Здесь мы пробуем bind с разными форматами principal, как в тестовом коде
//            String username = authentication.getName();
//            password = (String) authentication.getCredentials();
//
//            if (!username.toUpperCase().trim().equals("KvochkinAY".toUpperCase())) {
//                System.out.println("❌ У " + username + " нет доступа к этой системе, и не будет.");
//                throw new org.springframework.security.authentication.BadCredentialsException(
//                        "У " + username + " нет доступа к этой системе, и не будет.");
//            }
//            // Пробуем разные форматы имени пользователя (как в тестовом)
//            String[] principalFormats = {
////                    username + "@" + domain.toLowerCase(),
//                    domain + "\\" + username,
//                    username
//            };
//
//            Hashtable<String, String> env = new Hashtable<>();
//            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//            env.put(Context.PROVIDER_URL, url);
//            env.put(Context.SECURITY_AUTHENTICATION, "simple");
//            // Ключевая настройка для обхода требований подписи (может не сработать)
//            env.put("com.sun.jndi.ldap.tls.require", "false");
//
//            boolean success = false;
//            Exception lastException = null;
//
//            for (String principal : principalFormats) {
//                env.put(Context.SECURITY_PRINCIPAL, principal);
//                env.put(Context.SECURITY_CREDENTIALS, password);
//
//                try {
//                    // Пытаемся создать контекст (выполнить bind)
//                    new InitialDirContext(env);
//                    success = true;
//                    break; // Останавливаемся при первой успешной попытке
//                } catch (Exception e) {
//                    lastException = e;
//                    // Логируем ошибки, как в тестовом коде
//                    System.out.println("❌ Ошибка для principal (additionalAuthenticationChecks) '" + principal + "': " + e.getClass().getSimpleName());
//                    System.out.println("   Сообщение: " + e.getMessage());
//                    Throwable cause = e.getCause();
//                    while (cause != null) {
//                        System.out.println("   Причина: " + cause.getMessage());
//                        cause = cause.getCause();
//                    }
//                }
//            }
//
//            if (!success) {
//                throw new org.springframework.security.authentication.BadCredentialsException(
//                        "Не удалось аутентифицировать с ни одним форматом principal. Последняя ошибка: " +
//                                (lastException != null ? lastException.getMessage() : "Неизвестная ошибка"));
//            }
//        }
//
//        @Override
//        protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
//                throws AuthenticationException {
//            // Возвращаем минимальный UserDetails (поскольку bind уже прошёл)
////            String pass = (String) authentication.getCredentials();
//            return new org.springframework.security.core.userdetails.User(
//                    username, "", List.of(new SimpleGrantedAuthority("ROLE_USER")));
//        }
//    }
//}