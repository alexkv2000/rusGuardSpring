package com.rusguard.config;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import waffle.windows.auth.impl.WindowsAuthProviderImpl;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class WaffleToSpringSecurityFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // 1. Проверяем, есть ли уже аутентификация в Spring Security
        Authentication existingAuth = SecurityContextHolder.getContext().getAuthentication();

        // 2. Если Spring еще не знает пользователя, но Waffle уже создал Principal в запросе
        if (existingAuth == null || "anonymousUser".equals(existingAuth.getPrincipal())) {

            // Waffle сохраняет Principal в атрибуте запроса с ключом "javax.security.auth.subject.callable"
            // Или просто берем request.getUserPrincipal(), если Waffle уже отработал
            // Но надежнее всего достать из атрибута, куда Waffle его кладет.
            // Однако, так как мы используем NegotiateSecurityFilter, проще взять из запроса.

            if (request.getUserPrincipal() != null) {
                String username = request.getUserPrincipal().getName();

                // Создаем токен для Spring Security
                // Здесь мы даем пользователю роль ROLE_USER по умолчанию
                Authentication auth = new UsernamePasswordAuthenticationToken(
                        username,
                        null,
                        Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
                );

                // Кладем аутентификацию в контекст Spring
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }

        // Продолжаем цепочку фильтров
        filterChain.doFilter(request, response);
    }
}