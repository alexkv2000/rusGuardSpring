package com.rusguard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import waffle.servlet.NegotiateSecurityFilter;
import waffle.windows.auth.impl.WindowsAuthProviderImpl;

@Configuration
public class WaffleConfig {
    @Bean
    public NegotiateSecurityFilter waffleFilter() {
        NegotiateSecurityFilter filter = new NegotiateSecurityFilter();
        filter.setPrincipalFormat("fqn"); // DOMAIN\User
        filter.setRoleFormat("both");     // Роли
        // Инициализацию провайдера оставляем как было
        // ВАЖНО: Явно задаем провайдер, чтобы Waffle не был "пустым"
//        filter.setAuth(new WindowsAuthProviderImpl());

        // (Опционально) Можно указать протоколы, если Kerberos не нужен
        // filter.setProtocols("NTLM");
        return filter;
    }
}
