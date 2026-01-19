# Веб-сервис для интеграции с RusGuard

Этот веб-сервис предоставляет REST API для взаимодействия с системой RusGuard. Он позволяет выполнять различные операции с сотрудниками и их данными.

## Установка и запуск

Для запуска приложения выполните:

```
./build_and_run.bat
```

Приложение будет доступно по адресу: http://localhost:8080

## API Эндпоинты

### 1. Блокировка сотрудника

**POST** `/api/rusguard/Employee/setLocked`

Устанавливает статус блокировки для сотрудника.

#### Тело запроса:
```json
{
  "employeeId": "идентификатор сотрудника",
  "locked": true
}
```

#### Ответ:
```json
{
  "status": "success",
  "message": "Employee lock status updated successfully",
  "employeeId": "идентификатор сотрудника",
  "locked": true
}
```

### 2. Получение сотрудников по ID группы

**GET** `/api/rusguard/Employee/getByGroupID`

Получает список сотрудников по ID группы.

#### Параметры запроса:
- `groupId` - ID группы

#### Пример запроса:
```
GET /api/rusguard/Employee/getByGroupID?groupId=123
```

#### Ответ:
```json
{
  "status": "success",
  "message": "Employees retrieved by group ID successfully",
  "groupId": "123",
  "data": []
}
```

### 3. Получение сотрудника по ФИО

**GET** `/api/rusguard/Employee/getByFIO`

Получает информацию о сотруднике по его ФИО.

#### Параметры запроса:
- `firstName` - имя
- `lastName` - фамилия
- `middleName` - отчество

#### Пример запроса:
```
GET /api/rusguard/Employee/getByFIO?firstName=Иван&lastName=Иванов&middleName=Иванович
```

#### Ответ:
```json
{
  "status": "success",
  "message": "Employee retrieved by FIO successfully",
  "firstName": "Иван",
  "lastName": "Иванов",
  "middleName": "Иванович",
  "data": {}
}
```

### 4. Получение сотрудника по ID

**GET** `/api/rusguard/Employee/getById`

Получает информацию о сотруднике по его ID.

#### Параметры запроса:
- `id` - ID сотрудника

#### Пример запроса:
```
GET /api/rusguard/Employee/getById?id=123
```

#### Ответ:
```json
{
  "status": "success",
  "message": "Employee retrieved by ID successfully",
  "id": "123",
  "data": {}
}
```

### 5. Получение проходов сотрудника по дате

**GET** `/api/rusguard/Employee/getPassagesByDate`

Получает историю проходов сотрудника за определенную дату.

#### Параметры запроса:
- `employeeId` - ID сотрудника
- `date` - дата в формате YYYY-MM-DD

#### Пример запроса:
```
GET /api/rusguard/Employee/getPassagesByDate?employeeId=123&date=2023-01-01
```

#### Ответ:
```json
{
  "status": "success",
  "message": "Employee passages retrieved by date successfully",
  "employeeId": "123",
  "date": "2023-01-01",
  "data": []
}
```

## Зависимости

Проект использует:
- Spring Boot для создания веб-приложения
- Apache CXF версии 3.4.5 для взаимодействия с SOAP-сервисами RusGuard и генерации клиентских классов
- Apache CXF WS-Addressing для поддержки адресации веб-сервисов
- Jakarta EE API для поддержки JAX-WS аннотаций
- Jakarta SOAP API для работы с SOAP сообщениями
- javax.xml.ws API для обеспечения совместимости с устаревшими компонентами
- javax.jws API для поддержки WebService аннотаций
- Библиотеки RusGuard, находящиеся в директории `src/main/lib`
- WSDL-файл по пути: C:\Users\alexe\IdeaProjects\SOAP\src\main\resources\wsdl\LNetworkServer\LNetworkService.wsdl

При сборке проекта создается JAR-файл `entities.jar`, который используется как системная зависимость. 
Apache CXF автоматически генерирует необходимые классы в директорию `target/generated-sources/cxf`.