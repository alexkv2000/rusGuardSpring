package com.rusguard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import waffle.servlet.NegotiateSecurityFilter;
@Configuration
public class WaffleConfig {
    @Bean
    public NegotiateSecurityFilter waffleFilter() {
        NegotiateSecurityFilter filter = new NegotiateSecurityFilter();
        filter.setPrincipalFormat("fqn"); // DOMAIN\User
        filter.setRoleFormat("both");     // Роли
        // Инициализацию провайдера оставляем как было
        return filter;
    }
}
