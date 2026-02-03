package com.rusguard.controller;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.rusguard.client.ILNetworkConfigurationService;
import com.rusguard.client.ILNetworkConfigurationServiceGetAccessLevelsByEmployeeIDIncludeRemovedEmployeesDataNotFoundExceptionFaultFaultMessage;
import com.rusguard.schema.AccessLevelIdsRequest;
import com.rusguard.schema.SaveAcsEmployeeRequest;
import com.rusguard.service.EmployeeService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.SortOrder;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AccessLevelSortedColumn;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AccessLevelsOwner;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsAccessLevelSlimInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.LAccessLevelsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/rusguard/Employee")
@Tag(
        name = "Управление сотрудниками СКУД",
        description = "API для работы с сотрудниками системы контроля и управления доступом RusGuard"
)
@SecurityRequirement(name = "bearerAuth")
@Validated
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    private ILNetworkConfigurationService networkCnfgService;

    /**
     * Получение списка уровней доступа
     *
     * @return Список доступных уровней доступа
     */
    @Operation(summary = "Получить список уровней доступа", description = "Возвращает список всех доступных уровней доступа в системе", tags = {"Уровни доступа"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Успешное получение списка уровней доступа",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Map.class),
                            examples = @ExampleObject(
                                    name = "Пример ответа",
                                    value = """
                                            [
                                              {
                                                "ID": "a38abfd9-d277-43fb-b719-618c7c91e7a1",
                                                "Name": "Архив",
                                                "Description": "Доступ в архивный отдел",
                                                "EndDate": "2026-01-30",
                                                "NumberOfAccessPoints": "5"
                                              }
                                            ]
                                            """
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Внутренняя ошибка сервера",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Map.class),
                            examples = @ExampleObject(
                                    name = "Пример ошибки",
                                    value = """
                                            {
                                              "error": "Внутренняя ошибка сервера",
                                              "timestamp": "2026-01-30T10:30:00Z"
                                            }
                                            """
                            )
                    )
            )
    })
    @GetMapping("/getAccessLevels")
    public ResponseEntity<List<Map<String, Object>>> getAccessLevelsSlim() throws ILNetworkConfigurationServiceGetAccessLevelsByEmployeeIDIncludeRemovedEmployeesDataNotFoundExceptionFaultFaultMessage {
        List<Map<String, Object>> mapresult = new ArrayList<>();
        employeeService.getAccessLevelsSlim()
                .forEach(
                        tt -> {
                            Map<String, Object> itemMap = new LinkedHashMap<>();
                            itemMap.put("ID", tt.getId());
                            itemMap.put("Name", (!tt.getName().isNil()) ? tt.getName().getValue() : "");
                            Optional.ofNullable(tt.getDescription())
                                    .filter(desc -> !desc.isNil())
                                    .ifPresent(desc -> itemMap.put("Description", desc.getValue()));
                            itemMap.put("EndDate", (!tt.getEndDate().isNil()) ? tt.getEndDate().getValue().toString() : tt.getEndDate().getValue());
                            itemMap.put("NumberOfAccessPoints", tt.getNumberOfAccessPoints().toString());
                            mapresult.add(itemMap);
                        });
        return ResponseEntity.ok(mapresult);
    }

    /**
     * Получение списка уровней доступа сотрудника
     * @param idEmployee ID сотрудника
     * @return Список доступных уровней доступа сотрудника
     */
    @Operation(summary = "Получить список уровней доступа сотрудника", description = "Возвращает список всех доступных уровней доступа в системе сотрудника", tags = {"Уровни доступа"})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Успешное получение списка уровней доступа сотрудника",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Map.class),
                            examples = @ExampleObject(
                                    name = "Пример ответа",
                                    value = """
                                            [
                                              {
                                                "ID": "4e2fb631-c9ba-4c8e-9a51-2eb016d05203",
                                                "Name": "КИС",
                                                "NumberOfAccessPoints": "3"
                                              }
                                            ]
                                            """
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Внутренняя ошибка сервера",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Map.class),
                            examples = @ExampleObject(
                                    name = "Пример ошибки",
                                    value = """
                                            {
                                              "error": "Внутренняя ошибка сервера",
                                              "timestamp": "2026-01-30T10:30:00Z"
                                            }
                                            """
                            )
                    )
            )
    })
    @GetMapping("/getAccessLevelsEmployee")
    public ResponseEntity<List<Map<String, Object>>> getAccessLevelsByEmployeeID(String idEmployee) throws ILNetworkConfigurationServiceGetAccessLevelsByEmployeeIDIncludeRemovedEmployeesDataNotFoundExceptionFaultFaultMessage {
        List<Map<String, Object>> mapresult = new ArrayList<>();
        ResponseEntity <List<Map<String, Object>>> map = employeeService.getAccessLevelsByEmployeeID(idEmployee);
        for (int i = 0; i < Objects.requireNonNull(map.getBody()).size(); i++) {
            mapresult.add(map.getBody().get(i));
        }
        return ResponseEntity.ok(mapresult);
    }

    /**
     * Блокировка/разблокировка сотрудника
     *
     * @param idEmployee ID сотрудника
     * @param flagLock   true - заблокировать, false - разблокировать
     * @return Результат операции
     */
    @Operation(
            summary = "Блокировка/разблокировка сотрудника",
            description = "Блокирует или разблокирует доступ сотрудника в систему",
            tags = {"Безопасность"}
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Операция выполнена успешно",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Map.class),
                            examples = @ExampleObject(
                                    value = """
                                            {
                                              "status": "success",
                                              "message": "Сотрудник успешно заблокирован",
                                              "employeeId": "a38abfd9-d277-43fb-b719-618c7c91e7a1",
                                              "isLocked": true,
                                              "timestamp": "2024-01-21T10:30:00Z"
                                            }
                                            """
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Неверные параметры запроса",
                    content = @Content(
                            mediaType = "application/json",
                            examples = @ExampleObject(
                                    value = """
                                            {
                                              "error": "Неверный формат UUID сотрудника",
                                              "details": "Ожидается формат: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
                                            }
                                            """
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Сотрудник не найден"
            )
    })
    @PostMapping(value = "/lockEmployee",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> lockEmployee(@Parameter(
                                                                    description = "Уникальный идентификатор сотрудника",
                                                                    required = true,
                                                                    example = "a38abfd9-d277-43fb-b719-618c7c91e7a1",
                                                                    schema = @Schema(
                                                                            pattern = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$"
                                                                    )
                                                            )
                                                            @RequestParam(required = false) String idEmployee,

                                                            @Parameter(
                                                                    description = "Флаг блокировки: true - заблокировать, false - разблокировать",
                                                                    required = true,
                                                                    example = "true"
                                                            )
                                                            @RequestParam(required = false) boolean flagLock) {
        Map<String, Object> result;
        result = employeeService.lockAcsEmployee(idEmployee, flagLock);

        return ResponseEntity.ok(result);
    }

    /**
     * Установка уровней доступа для сотрудника
     *
     * @param employeeID             ID сотрудника
     * @param request                Список ID уровней доступа
     * @param isUseParentAccessLevel Использовать уровни доступа родительской группы (true = установить доступ родительской группы, игнорировав RequestBody)
     * @return Результат операции
     */
    @Operation(
            summary = "Установка уровней доступа",
            description = "Устанавливает уровни доступа для сотрудника или наследует их из родительской группы",
            tags = {"Уровни доступа"}
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Уровни доступа успешно обновлены"
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Ошибка при обновлении уровней доступа"
            )
    })
    @PostMapping(value = "/setAccessLevelEmployee",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> setAccessLevelEmployee(@Parameter(
                                                                              description = "ID сотрудника",
                                                                              required = true,
                                                                              example = "a38abfd9-d277-43fb-b719-618c7c91e7a1"
                                                                      )
                                                                      @RequestParam String employeeID,

                                                                      @io.swagger.v3.oas.annotations.parameters.RequestBody(
                                                                              description = "Список уровней доступа",
                                                                              required = true,
                                                                              content = @Content(
                                                                                      mediaType = "application/json",
                                                                                      schema = @Schema(implementation = AccessLevelIdsRequest.class),
                                                                                      examples = @ExampleObject(
                                                                                              name = "Пример запроса",
                                                                                              value = """
                                                                                                      {
                                                                                                        "guid": [
                                                                                                          "7692f539-83d0-44e6-90f0-5015f00daaa5",
                                                                                                          "4e2fb631-c9ba-4c8e-9a51-2eb016d05203",
                                                                                                          "779f720e-f8e3-4242-9782-d7877d92e437",
                                                                                                          "9b7e8a45-1620-4a00-96ea-c2423bc31e83",
                                                                                                          "b74e394b-e6cf-44dd-960b-c8f162a58cef"
                                                                                                        ]
                                                                                                      }
                                                                                                      """
                                                                                      )
                                                                              )
                                                                      )
                                                                      @Valid @RequestBody AccessLevelIdsRequest request,

                                                                      @Parameter(
                                                                              description = "Использовать уровни доступа родительской группы",
                                                                              required = true,
                                                                              example = "false"
                                                                      )
                                                                      @RequestParam boolean isUseParentAccessLevel) {

        try {
            // Преобразуем DTO в ArrayOfguid
            ArrayOfguid accessLevelIDs = new ArrayOfguid();
            if (request.getGuid() != null) {
                request.getGuid().forEach(accessLevelIDs.getGuid()::add);
            }

            Map<String, Object> result = employeeService.setUseEmployeeParentAccessLevel(
                    employeeID, accessLevelIDs, isUseParentAccessLevel);

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", e.getMessage());
            return ResponseEntity.badRequest().body(errorResponse);
        }
    }

    /**
     * Установка уровней доступа для сотрудника
     *
     * @param idEmployee ID сотрудника
     * @param flag       Использовать уровни блокировки сотрудника
     * @return Результат операции
     */
    @Operation(summary = "Установка уровней блокировки",
            description = "Устанавливает уровни блокировки для сотрудника, блокируя доступ")
    @ApiResponse(responseCode = "200", description = "Уровни доступа успешно обновлены")
    @ApiResponse(responseCode = "400", description = "Ошибка при обновлении уровней доступа")
    @PostMapping("/setLocked")
    public ResponseEntity<Map<String, Object>> setAccessLevelEmployee(@RequestParam String idEmployee, @RequestParam boolean flag) {
        try {
            employeeService.setEmployeeLocked(idEmployee, flag);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    /**
     * Поиск сотрудников по ФИО
     *
     * @param lastName   Фамилия
     * @param firstName  Имя
     * @param secondName Отчество
     * @param isLock     Фильтр по статусу блокировки
     * @return Список сотрудников, соответствующих критериям
     */
    @Operation(
            summary = "Поиск сотрудников по ФИО",
            description = "Возвращает список сотрудников, соответствующих указанным параметрам ФИО",
            tags = {"Поиск"}
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Успешное выполнение запроса"
            )
    })
    @GetMapping(value = "/getByFIO",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> getByFIO(@Parameter(
                                                                description = "Фамилия сотрудника",
                                                                example = "Иванов"
                                                        )
                                                        @RequestParam(required = false) String lastName,

                                                        @Parameter(
                                                                description = "Имя сотрудника",
                                                                example = "Иван"
                                                        )
                                                        @RequestParam(required = false) String firstName,

                                                        @Parameter(
                                                                description = "Отчество сотрудника",
                                                                example = "Иванович"
                                                        )
                                                        @RequestParam(required = false) String secondName,

                                                        @Parameter(
                                                                description = "Фильтр по статусу блокировки",
                                                                example = "false",
                                                                schema = @Schema(defaultValue = "false")
                                                        )
                                                        @RequestParam(required = false, defaultValue = "false") boolean isLock) {

        Map<String, String> params = new HashMap<>();
        if (firstName != null) params.put("firstName", firstName);
        if (lastName != null) params.put("lastName", lastName);
        if (secondName != null) params.put("secondName", secondName);
        params.put("isLock", String.valueOf(isLock));

        // Call the service method with the parameters
        Map<String, Object> result = employeeService.getEmployeeByFIO(params);
        return ResponseEntity.ok(result);
    }

    /**
     * Поиск сотрудников по ID
     *
     * @param idEmployee ID Сотрудника
     * @return Информация по сотруднику
     */
    @Operation(
            summary = "Получение сотрудника по ID",
            description = "Возвращает информацию о сотруднике по его уникальному идентификатору",
            tags = {"Поиск"}
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Сотрудник найден"),
            @ApiResponse(responseCode = "404", description = "Сотрудник не найден")
    })
    @GetMapping(
            value = "/getById",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getById(@Parameter(
            description = "Уникальный идентификатор сотрудника",
            required = true,
            example = "a38abfd9-d277-43fb-b719-618c7c91e7a1"
    )
                                                       @RequestParam(required = false) String idEmployee) {
        Map<String, Object> result = employeeService.getEmployeeById(idEmployee.toUpperCase());
        return ResponseEntity.ok(result);
    }

    /**
     * Поиск сотрудников по ID группы
     *
     * @param idGroup ID Группы сотрудников
     * @return Информация по сотрудникам
     */
    @Operation(summary = "Поиск сотрудника по ID группы",
            description = "Возвращает информацию по сотрудникам в группе")
    @ApiResponse(responseCode = "200", description = "Успешное выполнение запроса")
    @GetMapping("/getByGroupID")
    public ResponseEntity<Map<String, Object>> getByGroupID(@RequestParam(required = false) String idGroup) {
        Map<String, Object> result = employeeService.getEmployeesByGroupID(idGroup.toUpperCase());
        return ResponseEntity.ok(result);
    }

    /**
     * Поиск сотрудника по табельному номеру
     *
     * @param tabelNumber табельный номер сотрудника
     * @return Информация по сотруднику
     */
    @Operation(summary = "Поиск сотрудника по Табельному номеру",
            description = "Возвращает информацию по сотруднику")
    @ApiResponse(responseCode = "200", description = "Успешное выполнение запроса")
    @GetMapping("/getByTabelNumber")
    public ResponseEntity<Map<String, Object>> getByTabelNumber(@RequestParam(required = false) String tabelNumber) {
        Map<String, Object> result = employeeService.GetEmployeesByTabelNumber(tabelNumber);
        return ResponseEntity.ok(result);
    }

    /**
     * Поиск проходов сотрудника по ID сотрудника
     *
     * @param idEmployee   ID сотрудника
     * @param dataPassages Дата проходка сотрудника
     * @return Информация по проходам сотрудника
     */
    @Operation(
            summary = "Получение проходов сотрудника",
            description = "Возвращает список проходов/событий сотрудника за указанную дату",
            tags = {"Отчеты"}
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Успешно"),
            @ApiResponse(responseCode = "400", description = "Неверный формат даты")
    })
    @GetMapping(
            value = "/getPassagesByDate",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getPassagesByDate(@Parameter(
                                                                         description = "ID сотрудника",
                                                                         required = true,
                                                                         example = "C675452F-6881-426D-99A7-D7AF2FC6B943"
                                                                 )
                                                                 @RequestParam(required = false) String idEmployee,

                                                                 @Parameter(
                                                                         description = "Дата в формате dd-MM-yyyy",
                                                                         required = true,
                                                                         example = "30-01-2026"
                                                                 )
                                                                 @RequestParam(required = false) String dataPassages) {
        Map<String, Object> result = employeeService.getEmployeePassagesByDate(idEmployee.toUpperCase(), dataPassages);
        return ResponseEntity.ok(result);
    }

    /**
     * Добавление email сотруднику
     *
     * @param idEmployee  ID сотрудника
     * @param email       Адрес электронной почты
     * @param description Описание email
     * @return Результат операции
     */
    @Operation(summary = "Добавление email",
            description = "Добавляет адрес электронной почты для указанного сотрудника")
    @ApiResponse(responseCode = "200", description = "Email успешно добавлен")
    @ApiResponse(responseCode = "400", description = "Ошибка при добавлении email")
    @PostMapping("/addEmail")
    public ResponseEntity<Map<String, Object>> addEmail(@RequestParam(required = false) String idEmployee, @RequestParam(required = false) String email, @RequestParam(required = false) String description) {
        try {
            employeeService.addEmailEmployee(idEmployee, email, description);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    /**
     * Добавление сотрудника в справочник
     *
     * @param lastname         Фамилия
     * @param firstname        Имя
     * @param secondname       Отчество
     * @param tabelNumber      Табельный номер
     * @param position         Должность
     * @param positionGroup    Подразделение
     * @param Comment          Комментарий
     * @param AdressReg        Адресс регистрации
     * @param PassportIISUE    Паспорт номер
     * @param PassportNumber   Паспорт серия
     * @param Email            Электронный ящик (Email)
     * @param EmailDescription Комментарий к (Email)
     * @return Список сотрудников, соответствующих критериям
     */
    @Operation(summary = "Добавление сотрудник в справочник",
            description = "Возвращает информацию сотрудника, указанных в параметрах")
    @ApiResponse(responseCode = "200", description = "Успешное выполнение запроса")
    @PostMapping("/addEmployee")
    public ResponseEntity<Map<String, Object>> addEmployee(
            @RequestParam(required = false) String lastname,
            @RequestParam(required = false) String firstname,
            @RequestParam(required = false) String secondname,
            @RequestParam(required = false) String tabelNumber,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String positionGroup,
            @RequestParam(required = false) String Comment,
            @RequestParam(required = false) String AdressReg,
            @RequestParam(required = false) String PassportIISUE,
            @RequestParam(required = false) String PassportNumber,
            @RequestParam(required = false) String Email,
            @RequestParam(required = false) String EmailDescription
    ) {
        try {
            Integer intTabelNumber = Integer.valueOf(tabelNumber);
            employeeService.addEmployee(firstname, lastname, secondname, intTabelNumber, position, positionGroup, Comment, AdressReg, PassportIISUE, PassportNumber, Email, EmailDescription);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    /**
     * Сохраняет информацию сотрудника
     *
     * @param idEmployee ID сотрудника
     * @param request    структура JSON ({
     *                   "position":"2129e300-520e-4ec3-a95a-8b5c7dfb34a7",
     *                   "isChangeLocked":false,
     *                   "isChangePin":false,
     *                   "firstName":"Иван-3",
     *                   "lastName":"Иванов",
     *                   "secondName":"Иванович",
     *                   "tabelNumber": 7000003,
     *                   "Comment":"коментарий_1",
     *                   "RegistrationAddress":"Адрес регистрации_1",
     *                   "ResidentialAddress":"Адрес проживания_1",
     *                   "PassportIISUE":"7710",
     *                   "PassportNumber":"771010",
     *                   "email":"rrr@rrr.com",
     *                   "emailDescription":"Комментарий к почте_3",
     *                   "emailOrder":0
     *                   })
     * @return Результат операции
     */
    @Operation(
            summary = "Сохранение данных сотрудника СКУД",
            description = "Обновляет или создает данные сотрудника в системе контроля доступа",
            tags = {"Сотрудники"}
    )
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Данные успешно сохранены",
                    content = @Content(
                            mediaType = "application/json",
                            examples = @ExampleObject(
                                    value = """
                                            {
                                              "status": "success",
                                              "message": "Данные сотрудника обновлены",
                                              "idEmployee": "a38abfd9-d277-43fb-b719-618c7c91e7a1",
                                              "timestamp": "2026-01-30T10:30:00Z"
                                            }
                                            """
                            )
                    )
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Ошибка валидации данных"
            )
    })
    @PostMapping(
            value = "/saveAcsEmployee",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> saveAcsEmployee(@Parameter(
                                                                       description = "ID сотрудника (можно передать в теле запроса)",
                                                                       example = "a38abfd9-d277-43fb-b719-618c7c91e7a1"
                                                               )
                                                               @RequestParam(required = false) String idEmployee,

                                                               @io.swagger.v3.oas.annotations.parameters.RequestBody(
                                                                       description = "Данные сотрудника для сохранения",
                                                                       required = true,
                                                                       content = @Content(
                                                                               mediaType = "application/json",
                                                                               schema = @Schema(implementation = SaveAcsEmployeeRequest.class),
                                                                               examples = @ExampleObject(
                                                                                       name = "Пример запроса",
                                                                                       value = """
                                                                                               {
                                                                                                 "position": "2129e300-520e-4ec3-a95a-8b5c7dfb34a7",
                                                                                                 "isChangeLocked":false,
                                                                                                 "isChangePin":false,
                                                                                                 "firstName":"Иван-3",
                                                                                                 "lastName":"Иванов",
                                                                                                 "secondName":"Иванович",
                                                                                                 "tabelNumber": 7000003,
                                                                                                 "Comment":"Коментарий к сотруднику",
                                                                                                 "RegistrationAddress":"Адрес регистрации: Проспект Мира, д.1, кв.8",
                                                                                                 "ResidentialAddress":"Адрес проживания: Проспект Мира, д.1, кв.8",
                                                                                                 "PassportIISUE":"7710",
                                                                                                 "PassportNumber":"771010",
                                                                                                 "email":"IvanovII_test@mail.ru",
                                                                                                 "emailDescription":"Комментарий к почте - IvanovII_test",
                                                                                                 "emailOrder":0
                                                                                               }
                                                                                               """
                                                                               )
                                                                       )
                                                               )
                                                               @RequestBody SaveAcsEmployeeRequest request) {
        try {
            // Вызов сервиса с передачей DTO
            Map<String, Object> result = employeeService.saveAcsEmployee(idEmployee, request);

            // Проверяем статус операции
            if ("success".equals(result.get("status"))) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.badRequest().body(result);
            }
        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("status", "error");
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.badRequest().body(errorResponse);
        }
    }

    //--------------------------
    //справочники
    //--------------------------

    /**
     * Получение дерева групп сотрудников
     *
     * @return Иерархическая структура групп сотрудников
     */
    @Operation(
            summary = "Получение иерархии групп сотрудников",
            description = "Возвращает древовидную структуру всех групп сотрудников",
            tags = {"Справочники"}
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Успешное получение дерева групп")
    })
    @GetMapping(
            value = "/getEmployeesGroups",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getEmployeeGroups() {
        Map<String, Object> result = employeeService.GetEmployeeGroup().getBody();
        return ResponseEntity.ok(result);
    }
}