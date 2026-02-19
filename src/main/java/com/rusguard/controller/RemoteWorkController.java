package com.rusguard.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import waffle.windows.auth.impl.WindowsAccountImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/rusguard/RemoteWork")
@Tag(
        name = "Удалённая работа",
        description = "API для работы с информацией об удалённой работе сотрудников"
)
@SecurityRequirement(name = "bearerAuth")
public class RemoteWorkController {

    @Value("${app.remotework.api.url:http://DOC-APP8:4842/CDvService/86d8e4719c0cf1119f353a68ddb4ef9b/RemoteWork/SearchRemoteWorkInfo}")
    private String remoteWorkApiUrl;

    @Value("${app.security.allowed-users:}")
    private String allowedUsersConfig;

    @Value("${app.security.allowed-admin:}")
    private String allowedAdminConfig;

    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * Поиск информации об удалённой работе сотрудника
     *
     * @param request Запрос с параметрами поиска
     * @return Список записей об удалённой работе
     */
    @Operation(
            summary = "Поиск информации об удалённой работе",
            description = "Возвращает список записей об удалённой работе сотрудника за указанный период",
            tags = {"Удалённая работа"}
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Успешное получение данных",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = List.class),
                            examples = @ExampleObject(
                                    name = "Пример ответа",
                                    value = """
                                            [
                                              {
                                                "UserLogin": "GAZ\\\\KvochkinAY",
                                                "EventName": "Начало рабочего дня",
                                                "ReportText": "тестовый отчет -обед",
                                                "InfoDate": "2026-02-19T06:43:00"
                                              },
                                              {
                                                "UserLogin": "GAZ\\\\KvochkinAY",
                                                "EventName": "Конец рабочего дня",
                                                "ReportText": "тестовый отчет",
                                                "InfoDate": "2026-02-19T18:00:00"
                                              }
                                            ]
                                            """
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Ошибка в параметрах запроса"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Ошибка при обращении к внешнему сервису"
            )
    })
    @PostMapping(
            value = "/search",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> searchRemoteWork(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Параметры поиска",
                    required = true,
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = RemoteWorkSearchRequest.class),
                            examples = @ExampleObject(
                                    name = "Поиск по табельному номеру",
                                    value = """
                                            {
                                              "SearchType": 2,
                                              "SearchData": "766291",
                                              "StartDate": "2026-02-19T01:43:00",
                                              "EndDate": "2026-02-20T06:44:00"
                                            }
                                            """
                            )
                    )
            )
            @RequestBody RemoteWorkSearchRequest request) {

        // Проверка авторизации
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null || !auth.isAuthenticated()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }

        String currentUser = auth.getName();
        if (accessIsLock(allowedUsersConfig, currentUser)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        try {
            // Подготовка заголовков
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            // Создание сущности запроса
            HttpEntity<RemoteWorkSearchRequest> requestEntity = new HttpEntity<>(request, headers);

            // Отправка запроса к внешнему API
            ResponseEntity<String> response = restTemplate.exchange(
                    remoteWorkApiUrl,
                    HttpMethod.POST,
                    requestEntity,
                    String.class
            );

            if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
                System.out.println(response.getBody());
                return ResponseEntity.ok(response.getBody());
            } else {
                return ResponseEntity.status(response.getStatusCode()).build();
            }

        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Ошибка при обращении к сервису удалённой работы");
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    /**
     * Проверка доступа пользователя
     */
    private boolean accessIsLock(String accessUsers, String currentUser) {
        if (accessUsers == null || accessUsers.isEmpty()) {
            return false;
        }
        return Arrays.stream(accessUsers.toUpperCase().split(","))
                .map(String::trim)
                .noneMatch(allowedUser -> allowedUser.equalsIgnoreCase(currentUser));
    }

    /**
     * DTO для запроса поиска удалённой работы
     */
    @Schema(description = "Запрос на поиск информации об удалённой работе")
    public static class RemoteWorkSearchRequest {
        @Schema(
                description = "Тип поиска: 1 - по логину, 2 - по табельному номеру",
                example = "2",
                allowableValues = {"1", "2"}
        )
        private Integer SearchType;

        @Schema(
                description = "Логин или табельный номер",
                example = "766291"
        )
        private String SearchData;

        @Schema(
                description = "Дата начала периода (ISO формат)",
                example = "2026-02-19T01:00:00"
        )
        private String StartDate;

        @Schema(
                description = "Дата окончания периода (ISO формат)",
                example = "2026-02-20T23:59:59"
        )
        private String EndDate;

        // Getters and Setters
        public Integer getSearchType() {
            return SearchType;
        }

        public void setSearchType(Integer searchType) {
            this.SearchType = searchType;
        }

        public String getSearchData() {
            return SearchData;
        }

        public void setSearchData(String searchData) {
            this.SearchData = searchData;
        }

        public String getStartDate() {
            return StartDate;
        }

        public void setStartDate(String startDate) {
            this.StartDate = startDate;
        }

        public String getEndDate() {
            return EndDate;
        }

        public void setEndDate(String endDate) {
            this.EndDate = endDate;
        }
    }
}
