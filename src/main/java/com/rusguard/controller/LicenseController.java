package com.rusguard.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LicenseController {
    @GetMapping(value = "/terms", produces = MediaType.TEXT_HTML_VALUE)
    public String terminologyPage() throws IOException {
        // Читаем HTML шаблон
        ClassPathResource resource = new ClassPathResource("static/terminology.html");
        String htmlContent = new String(Files.readAllBytes(resource.getFile().toPath()), StandardCharsets.UTF_8);

        // Создаем карту замен с ВСЕМИ переменными
        Map<String, String> variables = new HashMap<>();
        variables.put("${companyName}", "ООО ЦИТРБ");
        variables.put("${licenseNumber}", "ITSNN-RUSGUARD-CORP-20260130-100");
        variables.put("${issueDate}", "30.01.2026");
        variables.put("${expiryDate}", "31.12.2026");
        variables.put("${date}", "30.01.2026");
        variables.put("${maxUsers}", "5");
        variables.put("${version}", "1.0.0");
        variables.put("${contactEmail}", "KvochkinAY@itsnn.ru");
        variables.put("${currentDate}", LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        // Дополнительные переменные для Thymeleaf синтаксиса
        variables.put("th:text=\"'Лицензионное соглашение - ' + ${companyName}\"", "");
        variables.put("th:text=\"${licenseNumber}\"", "");
        variables.put("th:text=\"${issueDate}\"", "");
        variables.put("th:text=\"${expiryDate}\"", "");
        variables.put("th:text=\"${maxUsers}\"", "");
        variables.put("th:text=\"${version}\"", "");
        variables.put("th:text=\"${date}\"", "");

        // Удаляем Thymeleaf атрибуты и заменяем их значениями
        for (Map.Entry<String, String> entry : variables.entrySet()) {
            htmlContent = htmlContent.replace(entry.getKey(), entry.getValue());
        }

        // Дополнительно заменяем Thymeleaf выражения на фактические значения
        htmlContent = htmlContent.replace("th:text=\"'Лицензионное соглашение - ' + ${companyName}\"", "");
        htmlContent = htmlContent.replace("<h1 th:text=\"'Лицензионное соглашение - ' + ${companyName}\"></h1>",
                "<h1>Лицензионное соглашение - ООО ЦИТРБ</h1>");

        // Удаляем ссылку на несуществующий CSS
        htmlContent = htmlContent.replace(
                "<link rel=\"stylesheet\" th:href=\"@{/css/swagger-ui.css}\">",
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/swagger-ui-dist@5.9.0/swagger-ui.css\">"
        );
        return htmlContent;
    }


    @GetMapping(value = "/license", produces = MediaType.TEXT_HTML_VALUE)
    public String licensePage() throws IOException {
        // Читаем HTML шаблон
        ClassPathResource resource = new ClassPathResource("static/license-page.html");
        String htmlContent = new String(Files.readAllBytes(resource.getFile().toPath()), StandardCharsets.UTF_8);

        // Создаем карту замен с ВСЕМИ переменными
        Map<String, String> variables = new HashMap<>();
        variables.put("${companyName}", "ООО ЦИТРБ");
        variables.put("${licenseNumber}", "ITSNN-RUSGUARD-CORP-20260130-100");
        variables.put("${issueDate}", "30.01.2026");
        variables.put("${expiryDate}", "31.12.2026");
        variables.put("${maxUsers}", "5");
        variables.put("${version}", "1.0.0");
        variables.put("${contactEmail}", "KvochkinAY@itsnn.ru");
        variables.put("${currentDate}", LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        // Дополнительные переменные для Thymeleaf синтаксиса
        variables.put("th:text=\"'Лицензионное соглашение - ' + ${companyName}\"", "");
        variables.put("th:text=\"${licenseNumber}\"", "");
        variables.put("th:text=\"${issueDate}\"", "");
        variables.put("th:text=\"${expiryDate}\"", "");
        variables.put("th:text=\"${maxUsers}\"", "");
        variables.put("th:text=\"${version}\"", "");

        // Удаляем Thymeleaf атрибуты и заменяем их значениями
        for (Map.Entry<String, String> entry : variables.entrySet()) {
            htmlContent = htmlContent.replace(entry.getKey(), entry.getValue());
        }

        // Дополнительно заменяем Thymeleaf выражения на фактические значения
        htmlContent = htmlContent.replace("th:text=\"'Лицензионное соглашение - ' + ${companyName}\"", "");
        htmlContent = htmlContent.replace("<h1 th:text=\"'Лицензионное соглашение - ' + ${companyName}\"></h1>",
                "<h1>Лицензионное соглашение - ООО ЦИТРБ</h1>");

        // Удаляем ссылку на несуществующий CSS
        htmlContent = htmlContent.replace(
                "<link rel=\"stylesheet\" th:href=\"@{/css/swagger-ui.css}\">",
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/swagger-ui-dist@5.9.0/swagger-ui.css\">"
        );

        return htmlContent;
    }
}