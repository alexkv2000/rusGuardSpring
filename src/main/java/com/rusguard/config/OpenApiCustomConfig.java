package com.rusguard.config;

//import io.swagger.v3.oas.annotations.enums.ParameterIn;
//import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;

@Configuration
public class OpenApiCustomConfig {

    @Bean
    public OperationCustomizer customize() {
        return (operation, handlerMethod) -> {
//            // Добавляем глобальные параметры ко всем операциям
//            operation.addParametersItem(new Parameter()
//                    .in(ParameterIn.HEADER.toString())
//                    .name("X-Request-ID")
//                    .description("Идентификатор запроса для трассировки")
//                    .required(false)
//                    .example("req-12345")
//            );
//
//            operation.addParametersItem(new Parameter()
//                    .in(ParameterIn.HEADER.toString())
//                    .name("X-API-Key")
//                    .description("Ключ API для аутентификации")
//                    .required(false)
//            );

            // Добавляем информацию о том, какой метод контроллера
            if (handlerMethod instanceof HandlerMethod) {
                HandlerMethod hm = handlerMethod;
                operation.setDescription(
                        operation.getDescription() +
                                " (Метод контроллера: " + hm.getMethod().getName() + ")"
                );
            }
            return operation;
        };
    }
}
