package com.rusguard.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LicenseController {

    private String readResourceAsString(String resourcePath) throws IOException {
        ClassPathResource resource = new ClassPathResource(resourcePath);
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    @GetMapping(value = "/terms", produces = MediaType.TEXT_HTML_VALUE)
    public String terminologyPage() throws IOException {
        return replacePlaceholders("static/terminology.html", createLicenseMap());
    }

    @GetMapping(value = "/license", produces = MediaType.TEXT_HTML_VALUE)
    public String licensePage() throws IOException {
        return replacePlaceholders("static/license-page.html", createLicenseMap());
    }

    private Map<String, String> createLicenseMap() {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return Map.of(
                "${companyName}", "ООО ЦИТРБ",
                "${licenseNumber}", "ITSNN-RUSGUARD-CORP-20260130-100",
                "${issueDate}", "30.01.2026",
                "${expiryDate}", "31.12.2026",
                "${date}", "30.01.2026",
                "${maxUsers}", "5",
                "${version}", "1.0.0",
                "${contactEmail}", "KvochkinAY@itsnn.ru",
                "${currentDate}", currentDate
        );
    }

    private String replacePlaceholders(String resourcePath, Map<String, String> replacements) throws IOException {
        String html = readResourceAsString(resourcePath);

        // Заменяем плейсхолдеры ${...} на значения
        for (Map.Entry<String, String> entry : replacements.entrySet()) {
            html = html.replace(entry.getKey(), entry.getValue());
        }

        // Удаляем Thymeleaf атрибуты и заменяем их содержимым
        html = html.replace(
                "<h1 th:text=\"'Лицензионное соглашение - ' + ${companyName}\"></h1>",
                "<h1>Лицензионное соглашение - ООО ЦИТРБ</h1>"
        );

        // Удаляем ссылку на несуществующий CSS и заменяем на CDN
        html = html.replace(
                "<link rel=\"stylesheet\" th:href=\"@{/css/swagger-ui.css}\">",
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/swagger-ui-dist@5.9.0/swagger-ui.css\">"
        );

        // Удаляем все оставшиеся Thymeleaf атрибуты (опционально, если они мешают)
        html = html.replaceAll("\\s+th:\\w+=\"[^\"]*\"", "");

        return html;
    }
}
