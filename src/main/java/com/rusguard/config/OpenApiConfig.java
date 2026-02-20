package com.rusguard.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@OpenAPIDefinition(
        info = @Info(
                title = "RusGuard Employee Management API, version:",
                version = "1.0.0",
                description = "API для интеграции с системой контроля доступа RusGuard",
                contact = @Contact(
                        name = "Отдел разработки документооборота",
                        email = "KvochkinAY@itsnn.ru",
                        url = "http://doc-app8:8888/xwiki/bin/view/DV стартовая/"
                ),
                license = @License(
                        name = "Лицензия компании",
                        url = "/api/license"
                ),
                termsOfService = "/api/terms"
        ),
        servers = {
                @Server(
                        url = "http://172.18.2.198:8007",
                        description = "Продуктивный сервер DV"
                ),
                @Server(
                        url = "http://localhost:8007",
                        description = "Локальный сервер разработки"
                )
        }
)
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
//                        .addSecuritySchemes("bearerAuth",
//                                new SecurityScheme()
//                                        .type(SecurityScheme.Type.HTTP)
//                                        .scheme("bearer")
//                                        .bearerFormat("JWT")
//                                        .description("Токен аутентификации в формате JWT")
//                        )
                        .addSecuritySchemes("basicAuth",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("basic")
                                        .description("Базовая аутентификация")
                        )
                )
                .addSecurityItem(
                        new SecurityRequirement().addList("bearerAuth")
                );
    }
}