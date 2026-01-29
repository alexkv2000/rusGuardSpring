package com.rusguard.service.impl;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.rusguard.schema.SaveAcsEmployeeRequest;
import com.rusguard.service.EmployeeService;


import jakarta.xml.bind.JAXBElement;
import jakarta.xml.ws.BindingProvider;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.ws.security.SecurityConstants;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.SortOrder;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.*;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.*;
import org.springframework.stereotype.Service;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.addressing.WSAddressingFeature;
import com.rusguard.client.*;
import org.tempuri.LNetworkService;

import javax.net.ssl.*;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import java.io.File;
import java.io.IOException;
import java.lang.Exception;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

// Импортируем сгенерированный интерфейс

/**
 * Created by alexe on 27.05.2019.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final String SERVICE_URL = "https://scud-1.gaz.ru/LNetworkServer/LNetworkService.svc";
    final String NS_EMPLOYEES = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees";
    private static final String CONFIG_SERVICE_URL = SERVICE_URL;
    private static final String USERNAME = "KvochkinAY";
    private static final String PASSWORD = "%*5I1OO4rpE%";
    // Статические прокси-объекты
    private static ILNetworkService networkService;
    private static ILNetworkConfigurationService networkCnfgService;

    private static Object getValue(Object obj, String methodName) {
        try {
            Method m = obj.getClass().getMethod(methodName);
            Object v = m.invoke(obj);
            if (v == null) {
                return "";
            }
            if (v instanceof JAXBElement) {
                return ((JAXBElement<?>) v).getValue();
            }
            return v;
        } catch (Exception e) {
            return "";
        }
    }

    private static String getEmployeeLastName(AcsEmployeeFull employee) {
        if (employee == null) {
            return "";
        }
        Object lastName = getValue(employee, "getLastName");
        return lastName != null ? lastName.toString() : "";
    }

    private static void configureWSSecurity(BindingProvider port) {
        // Set WS-Security properties
        Map<String, Object> requestContext = port.getRequestContext();

        // Username token profile
        Map<String, Object> props = new HashMap<>();
        props.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        props.put(WSHandlerConstants.USER, USERNAME);
        props.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        props.put(WSHandlerConstants.PW_CALLBACK_REF, new CallbackHandler() {
            @Override
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
                pc.setPassword(PASSWORD);
            }
        });

        // properties in the request context
        requestContext.put(WSHandlerConstants.USERNAME_TOKEN, USERNAME);
        requestContext.put(WSHandlerConstants.PASSWORD_TYPE, PASSWORD);
        requestContext.put(WSHandlerConstants.ADD_USERNAMETOKEN_NONCE, "true");
        requestContext.put(WSHandlerConstants.ADD_USERNAMETOKEN_CREATED, "true");

        // security properties
        requestContext.put(SecurityConstants.USERNAME, USERNAME);
        requestContext.put(SecurityConstants.PASSWORD, PASSWORD);
        requestContext.put(SecurityConstants.CALLBACK_HANDLER, new CallbackHandler() {
            @Override
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
                pc.setPassword(PASSWORD);
            }
        });

        // security interceptor
        Client client = ClientProxy.getClient(port);
        Endpoint cxfEndpoint = client.getEndpoint();

        Map<String, Object> outProps = new HashMap<>();
        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.USER, USERNAME);
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        outProps.put(WSHandlerConstants.PW_CALLBACK_REF, new CallbackHandler() {
            @Override
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
                pc.setPassword(PASSWORD);
            }
        });

        WSS4JOutInterceptor wssOut =
                new WSS4JOutInterceptor(outProps);
        cxfEndpoint.getOutInterceptors().add(wssOut);
    }

    private static void configureCxfTls(Object port) {
        Client client = ClientProxy.getClient(port);
        if (!(client.getConduit() instanceof HTTPConduit)) {
            return;
        }

        HTTPConduit conduit = (HTTPConduit) client.getConduit();

        TLSClientParameters tlsParams = new TLSClientParameters();
        tlsParams.setDisableCNCheck(true);

        SSLContext sc = createTrustAllSslContext();
        tlsParams.setSslContext(sc);
        tlsParams.setSSLSocketFactory(sc.getSocketFactory());
        tlsParams.setHostnameVerifier((hostname, session) -> true);

        conduit.setTlsClientParameters(tlsParams);
    }

    private static SSLContext createTrustAllSslContext() {
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                            return new X509Certificate[0];
                        }

                        public void checkClientTrusted(X509Certificate[] certs, String authType) {
                        }

                        public void checkServerTrusted(X509Certificate[] certs, String authType) {
                        }
                    }
            };

            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            return sc;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void disableSSLVerification() {
        try {
            SSLContext sc = createTrustAllSslContext();
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = (hostname, session) -> true;

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void initServices() {
        try {
            if (networkService != null && networkCnfgService != null) {
                return;
            }

            // Disable SSL verification (for development only)
            disableSSLVerification();
            //Подавление вывода Логов
            Logger.getLogger("org.tempuri").setLevel(Level.OFF);
            Logger.getLogger("org.tempuri.LNetworkService").setLevel(Level.OFF);

            System.out.println("Инициализация сервисов...");
            System.out.println("Подключаемся к WSDL: " + SERVICE_URL + "?wsdl");

            // Create service from classpath WSDL to avoid network WSDL download
            URL wsdlUrl = EmployeeServiceImpl.class.getClassLoader()
                    .getResource("wsdl/LNetworkServer/LNetworkService.wsdl");
            if (wsdlUrl == null) {
                throw new IllegalStateException("WSDL not found in classpath: wsdl/LNetworkServer/LNetworkService.wsdl");
            }

            LNetworkService service = new LNetworkService(wsdlUrl);
            if (networkService == null) {
                networkService = service.getBasicHttpBindingILNetworkService();
            }
            if (networkCnfgService == null) {
                networkCnfgService = service.getBasicHttpBindingILNetworkConfigurationService();
            }

            // Configure timeouts (milliseconds) + force URLConnectionHTTPConduit
            BindingProvider bpTimeout = (BindingProvider) networkService;
            bpTimeout.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, SERVICE_URL);
            bpTimeout.getRequestContext().put("force.urlconnection.http.conduit", Boolean.TRUE);
            bpTimeout.getRequestContext().put("javax.xml.ws.client.connectionTimeout", "10000");
            bpTimeout.getRequestContext().put("javax.xml.ws.client.receiveTimeout", "30000");
            bpTimeout.getRequestContext().put("jakarta.xml.ws.client.connectionTimeout", "10000");
            bpTimeout.getRequestContext().put("jakarta.xml.ws.client.receiveTimeout", "30000");

            BindingProvider bpTimeoutCfg = (BindingProvider) networkCnfgService;
            bpTimeoutCfg.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, CONFIG_SERVICE_URL);
            bpTimeoutCfg.getRequestContext().put("force.urlconnection.http.conduit", Boolean.TRUE);
            bpTimeoutCfg.getRequestContext().put("javax.xml.ws.client.connectionTimeout", "10000");
            bpTimeoutCfg.getRequestContext().put("javax.xml.ws.client.receiveTimeout", "30000");
            bpTimeoutCfg.getRequestContext().put("jakarta.xml.ws.client.connectionTimeout", "10000");
            bpTimeoutCfg.getRequestContext().put("jakarta.xml.ws.client.receiveTimeout", "30000");

            configureCxfTls(networkService);
            configureCxfTls(networkCnfgService);

            // Configure WS-Security
            configureWSSecurity((BindingProvider) networkService);
            configureWSSecurity((BindingProvider) networkCnfgService);

            System.out.println("Сервис успешно инициализирован");
        } catch (Exception e) {
            throw new RuntimeException("Не удалось инициализировать сервисы", e);
        }
    }

    // Метод для создания SOAP-клиента
    private ILNetworkService createClient() {
        try {
            // Загружаем WSDL из classpath
            File wsdlUrl = new File("C:\\Users\\alexe\\IdeaProjects\\SOAP\\src\\main\\resources\\wsdl\\LNetworkServer\\LNetworkService.wsdl");
            System.out.println("WSDL URL: " + wsdlUrl);
            if (wsdlUrl == null) {
                throw new IllegalStateException("WSDL file not found in classpath. Expected at: wsdl/LNetworkServer/LNetworkService.wsdl");
            }
            // Определяем QName для сервиса и порта
            QName serviceName = new QName("http://tempuri.org/", "LNetworkService");
            QName portName = new QName("http://tempuri.org/", "BasicHttpBinding_ILNetworkService");
            // URL конечной точки сервиса
            String endpoint = "http://scud-1.gaz.ru/LNetworkServer/LNetworkService.svc";

            // Настраиваем JAX-WS клиент
            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
            factory.setWsdlURL(wsdlUrl.toString());
            factory.setServiceClass(ILNetworkService.class);
            factory.setServiceName(serviceName);
            factory.setEndpointName(portName);
            factory.setAddress(endpoint);

            // Добавляем поддержку WS-Addressing (важно для WCF)
            factory.getFeatures().add(new WSAddressingFeature());

            // Создаем и возвращаем клиент
            return (ILNetworkService) factory.create();
        } catch (Exception e) {
            System.err.println("Ошибка при создании SOAP-клиента: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Не удалось инициализировать SOAP-клиент", e);
        }
    }

    @Override
    public List<AcsAccessLevelSlimInfo> getAccessLevelsSlim() { //Получение всех уровней доступа
        initServices();
        List<AcsAccessLevelSlimInfo> accessLevels = networkService.getAcsAccessLevelsSlimInfo().getAcsAccessLevelSlimInfo();
        //Уровень доступа (вывод только PIONT ACCESS)
        return accessLevels.stream()
                .filter(tt -> !tt.isIsRemoved()) // фильтруем удалённые
                .sorted(Comparator.comparing(
                        tt -> {
                            String name = tt.getName() != null ? tt.getName().getValue() : "";
                            return name.length() >= 4 ? name.substring(0, 4) : name; // первые 4 или всё, если меньше
                        }
                ))
                .collect(Collectors.toList());
    }


    @Override
    public Map<String, Object> setEmployeeLocked(String IDEmployee, boolean lock) {
        Map<String, Object> response = new LinkedHashMap<>();
        if (IDEmployee == null) {
            throw new IllegalArgumentException("id is null");
        }
        lockAcsEmployee(IDEmployee, lock);

        response.put("status", "success");
        response.put("message", "Employee lock status updated successfully (stub implementation)");
        response.put("employeeId", IDEmployee);
        response.put("locked", lock);
        return response;
    }

    public static void lockAcsEmployee(String idEmployee, boolean isLocked) { // Заблокировать или разблокировать сотрудников.
        try {
            initServices();
            if (networkCnfgService == null) {
                throw new IllegalStateException("networkCnfgService is not initialized. Call initServices() first.");
            }
            ArrayOfguid arrayOfGuid = new ArrayOfguid();
            arrayOfGuid.getGuid().add(idEmployee);

            QName NS_ARRAY_OFGUID = new QName(
                    "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                    "ids"
            );
            JAXBElement<ArrayOfguid> idsElement = new JAXBElement<>(
                    NS_ARRAY_OFGUID,
                    ArrayOfguid.class,
                    arrayOfGuid
            );
            // Теперь вызов метода с JAXBElement
            networkCnfgService.lockAcsEmployee(idsElement.getValue(), isLocked);

        } catch (Exception e) {
            System.err.println("Ошибка блокировки сотрудников: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<String, Object> getEmployeesByGroupID(String idGroup) {
        // Initialize response map
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            initServices();

            ArrayOfguid employeesGuids = networkService.getAcsEmployeesGuidsByGroups(
                    toUuidArray(new String[]{idGroup}),
                    false
            );
            if (employeesGuids != null && employeesGuids.getGuid() != null) {
                List<AcsEmployeeFull> employees = new ArrayList<>();
                for (String employeeId : employeesGuids.getGuid()) {
                    AcsEmployeeFull employee = getAcsEmployee(employeeId);
                    if (employee != null) {
                        employees.add(employee);
                    }
                }
                employees.sort(
                        Comparator
                                .comparing((AcsEmployeeFull e) -> !isEmployeeLocked(e))
                                .thenComparing(EmployeeServiceImpl::getEmployeeLastName, String.CASE_INSENSITIVE_ORDER)
                );
                List<Map<String, Object>> employeesList = new ArrayList<>();

                for (AcsEmployeeFull employee : employees) {
                    Map<String, Object> empData = new LinkedHashMap<>();
                    empData.put("ID", employee.getID());
                    empData.put("GroupID", employee.getEmployeeGroupID() != null ? employee.getEmployeeGroupID() : "");
                    empData.put("LastName", employee.getLastName() != null ? employee.getLastName().getValue() : "");
                    empData.put("FirstName", employee.getFirstName() != null ? employee.getFirstName().getValue() : "");
                    empData.put("SecondName", employee.getSecondName() != null ? employee.getSecondName().getValue() : "");
                    if (employee.getPosition() != null) {
                        try {
                            Object position = employee.getPosition();
                            // Try to call getValue() method
                            Method getValueMethod = position.getClass().getMethod("getValue");
                            Object positionValue = getValueMethod.invoke(position);

                            if (positionValue != null) {
                                // Now try to get the name from the position value
                                Method getNameMethod = positionValue.getClass().getMethod("getName");
                                Object nameValue = getNameMethod.invoke(positionValue);

                                if (nameValue != null) {
                                    // If name is a JAXBElement, get its value
                                    if (nameValue instanceof JAXBElement) {
                                        empData.put("Position", ((JAXBElement<?>) nameValue).getValue().toString());
                                    } else {
                                        empData.put("Position", nameValue.toString());
                                    }
                                } else {
                                    empData.put("Position", "");
                                }
                            } else {
                                empData.put("Position", "");
                            }
                        } catch (Exception e) {
                            // Log the error for debugging
                            System.err.println("Error getting position: " + e.getMessage());
                            empData.put("Position", "");
                        }
                    } else {
                        empData.put("Position", "");
                    }
                    empData.put("PassportIssue", employee.getPassportIssue() != null ? employee.getPassportIssue().getValue() : "");
                    empData.put("PassportNumber", employee.getPassportNumber() != null ? employee.getPassportNumber().getValue() : "");
                    empData.put("IsLocked", employee.isIsLocked() != null ? employee.isIsLocked() : false);
//                    response.put("status", "success");
//                    response.put("message", "Employee retrieved by ID successfully");
//                    response.put("groupId", employee.getEmployeeGroupID());
                    employeesList.add(empData);
                }

                //сортируем список
                sortEmployeesByFIO(employeesList);

                response.put("status", "success");
                response.put("message", "Employee retrieved by ID successfully");
                response.put("groupId", idGroup);
                response.put("data", employeesList);
            }
        } catch (ILNetworkServiceGetAcsEmployeesGuidsByGroupsDataNotFoundExceptionFaultFaultMessage e) {
            response.put("status", "error");
            response.put("message", "Error retrieving employees: " + e.getMessage());
            response.put("groupId", idGroup);
            return response;
        }
        return response;
    }

    // Вспомогательный метод: преобразование String[] в UUID[]
    private static ArrayOfguid toUuidArray(String[] ids) {
        if (ids == null) return null;
        ArrayOfguid result = new ArrayOfguid();
        for (String id : ids) {
            if (id != null) {
                result.getGuid().add(UUID.fromString(id).toString());
            }
        }
        return result;
    }

    @Override
    public Map<String, Object> getEmployeeByFIO(Map<String, String> params) {
        // Если нет параметра lastName - выдаем пустой JSON
        if (!params.containsKey("lastName") || getLastName(params).isBlank()) {
            Map<String, Object> response = new LinkedHashMap<>();
            response.put("status", "success");
            response.put("data", new ArrayList<>());
            response.put("count", 0);
            return response;
        }

        String lastName = ""; //фамилия
        lastName = params.get("lastName");

        String firstName = ""; //имя
        if (!getFirstName(params).isBlank()) {
            firstName = params.get("firstName");
        }
        String middleName = ""; //отчество
        if (!getSecondName(params).isBlank()) {
            middleName = params.get("secondName");
        }
        boolean isLock = Boolean.parseBoolean(params.get("isLock"));


        System.setProperty("org.apache.cxf.stax.allowInsecureParser", "true");
        System.setProperty("ws-security.disable.wsm4j", "true");
        System.setProperty("ws-security.validate.token", "false");

        // Initialize response map
        Map<String, Object> response = new LinkedHashMap<>();

        try {
            SearchCondition searchCondition = new SearchCondition();
            searchCondition.setIsGlobalSearch(true);
            searchCondition.setIncludeRemoved(true);

            initServices();
            // Параметры поиска
            JAXBElement<String> lastNameElement = new JAXBElement<>(
                    new QName(NS_EMPLOYEES, "LastName"), String.class, lastName);
            if (!lastName.isEmpty()) searchCondition.setLastName(lastNameElement);

            JAXBElement<String> firstNameElement = new JAXBElement<>(
                    new QName(NS_EMPLOYEES, "FirstName"), String.class, firstName);
            if (!firstName.isEmpty()) searchCondition.setFirstName(firstNameElement);

            JAXBElement<String> secondNameElement = new JAXBElement<>(
                    new QName(NS_EMPLOYEES, "SecondName"), String.class, middleName);
            if (!middleName.isEmpty()) searchCondition.setSecondName(secondNameElement);

            ArrayOfAcsEmployee result;
            System.out.println("Выполнение поиска сотрудников по фамилии...");
            if (!lastName.isEmpty() && (firstName.isEmpty() || middleName.isEmpty())) { //поиск по Фамилия
                SearchCondition searchConditionSecond = new SearchCondition();
                searchConditionSecond.setIsGlobalSearch(true);
                searchConditionSecond.setIncludeRemoved(true);
                searchConditionSecond.setLastName(lastNameElement);
                // Execute search
                result = networkService.findEmployees(searchConditionSecond);
                // Process results
                if (result != null && result.getAcsEmployee() != null && !result.getAcsEmployee().isEmpty()) {
                    List<Map<String, Object>> employeesList = new ArrayList<>();

                    // First collect all employees with their full data
                    for (AcsEmployee employee : result.getAcsEmployee()) {
                        AcsEmployeeFull fullEmployee = getAcsEmployee(employee.getEmployeeID());
                        if (fullEmployee != null && (!isLock || !fullEmployee.isIsLocked())) {
                            Map<String, Object> empData = new LinkedHashMap<>();
                            empData.put("ID", fullEmployee.getID());
                            empData.put("LastName", fullEmployee.getLastName() != null ? fullEmployee.getLastName().getValue() : "");
                            empData.put("FirstName", fullEmployee.getFirstName() != null ? fullEmployee.getFirstName().getValue() : "");
                            empData.put("SecondName", fullEmployee.getSecondName() != null ? fullEmployee.getSecondName().getValue() : "");
                            if (fullEmployee.getPosition() != null) {
                                try {
                                    Object position = fullEmployee.getPosition();
                                    // Попытка вызвать getValue() метод
                                    Method getValueMethod = position.getClass().getMethod("getValue");
                                    Object positionValue = getValueMethod.invoke(position);

                                    if (positionValue != null) {
                                        // Now try to get the name from the position value
                                        Method getNameMethod = positionValue.getClass().getMethod("getName");
                                        Object nameValue = getNameMethod.invoke(positionValue);

                                        if (nameValue != null) {
                                            // если есть должность в JAXBElement, берем значение Position
                                            if (nameValue instanceof JAXBElement) {
                                                empData.put("Position", ((JAXBElement<?>) nameValue).getValue().toString());
                                            } else {
                                                empData.put("Position", nameValue.toString());
                                            }
                                        } else {
                                            empData.put("Position", "");
                                        }
                                    } else {
                                        empData.put("Position", "");
                                    }
                                } catch (Exception e) {
                                    System.err.println("Error getting position: " + e.getMessage());
                                    empData.put("Position", "");
                                }
                            } else {
                                empData.put("Position", "");
                            }
                            empData.put("PassportIssue", fullEmployee.getPassportIssue() != null ? fullEmployee.getPassportIssue().getValue() : "");
                            empData.put("PassportNumber", fullEmployee.getPassportNumber() != null ? fullEmployee.getPassportNumber().getValue() : "");
                            empData.put("IsLocked", fullEmployee.isIsLocked() != null ? fullEmployee.isIsLocked() : false);

                            employeesList.add(empData);
                        }
                    }

                    // сортировка list
                    sortEmployeesByFIO(employeesList);
                    response.put("status", "success");
                    response.put("data", employeesList);
                    response.put("count", employeesList.size());
                }
            } else if (!lastName.isEmpty() && !firstName.isEmpty() && !middleName.isEmpty()) {
                // Execute search

                System.out.println("Выполнение поиска сотрудников по ФИО...");
                result = networkService.findEmployees(searchCondition);

                // Process results
                if (result != null && result.getAcsEmployee() != null && !result.getAcsEmployee().isEmpty()) {
                    List<Map<String, Object>> employeesList = new ArrayList<>();

                    // First collect all employees with their full data
                    for (AcsEmployee employee : result.getAcsEmployee()) {
                        AcsEmployeeFull fullEmployee = getAcsEmployee(employee.getEmployeeID());
                        if (fullEmployee != null && (!isLock || !fullEmployee.isIsLocked())) {
                            Map<String, Object> empData = new LinkedHashMap<>();
                            empData.put("ID", fullEmployee.getID());
                            empData.put("LastName", fullEmployee.getLastName() != null ? fullEmployee.getLastName().getValue() : "");
                            empData.put("FirstName", fullEmployee.getFirstName() != null ? fullEmployee.getFirstName().getValue() : "");
                            empData.put("SecondName", fullEmployee.getSecondName() != null ? fullEmployee.getSecondName().getValue() : "");
                            if (fullEmployee.getPosition() != null) {
                                try {
                                    Object position = fullEmployee.getPosition();
                                    // Try to call getValue() method
                                    Method getValueMethod = position.getClass().getMethod("getValue");
                                    Object positionValue = getValueMethod.invoke(position);

                                    if (positionValue != null) {
                                        // Now try to get the name from the position value
                                        Method getNameMethod = positionValue.getClass().getMethod("getName");
                                        Object nameValue = getNameMethod.invoke(positionValue);

                                        if (nameValue != null) {
                                            // If name is a JAXBElement, get its value
                                            if (nameValue instanceof JAXBElement) {
                                                empData.put("Position", ((JAXBElement<?>) nameValue).getValue().toString());
                                            } else {
                                                empData.put("Position", nameValue.toString());
                                            }
                                        } else {
                                            empData.put("Position", "");
                                        }
                                    } else {
                                        empData.put("Position", "");
                                    }
                                } catch (Exception e) {
                                    // Log the error for debugging
                                    System.err.println("Error getting position: " + e.getMessage());
                                    empData.put("Position", "");
                                }
                            } else {
                                empData.put("Position", "");
                            }
                            empData.put("PassportIssue", fullEmployee.getPassportIssue() != null ? fullEmployee.getPassportIssue().getValue() : "");
                            empData.put("PassportNumber", fullEmployee.getPassportNumber() != null ? fullEmployee.getPassportNumber().getValue() : "");
                            empData.put("IsLocked", fullEmployee.isIsLocked() != null ? fullEmployee.isIsLocked() : false);

                            employeesList.add(empData);
                        }
                    }

                    //Сортировка list
                    sortEmployeesByFIO(employeesList);

                    response.put("status", "success");
                    response.put("data", employeesList);
                    response.put("count", employeesList.size());
                } else {
                    response.put("status", "not_found");
                    response.put("message", "No employees found");
                    response.put("data", Collections.emptyList());
                    response.put("count", 0);
                }
            }
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error searching employees: " + e.getMessage());
            e.printStackTrace();
        }
        return response;
    }

    private static void sortEmployeesByFIO(List<Map<String, Object>> employeesList) {
        employeesList.sort(
                Comparator
                        // IsLocked (false first, null трактуем как false)
                        .comparing(
                                (Map<String, Object> e) -> {
                                    Boolean locked = (Boolean) e.get("IsLocked");
                                    return locked != null ? locked : false;
                                }
                        )
                        .thenComparing(
                                e -> (String) e.get("LastName").toString().toUpperCase(),
                                Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)
                        )
                        .thenComparing(
                                e -> (String) e.get("FirstName"),
                                Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)
                        ).thenComparing(
                                e -> (String) e.get("SecondName"),
                                Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)
                        ));
    }

    private String getLastName(Map<String, String> lastName) {
        boolean exists = lastName.containsKey("lastName");
        if (exists) {
            return lastName.get("lastName");
        }
        return "";
    }

    private String getFirstName(Map<String, String> firstName) {
        boolean exists = firstName.containsKey("firstName");
        if (exists) {
            return firstName.get("firstName");
        }
        return "";
    }

    private String getSecondName(Map<String, String> secondName) {
        boolean exists = secondName.containsKey("secondName");
        if (exists) {
            return secondName.get("secondName");
        }
        return "";
    }

    private static boolean isEmployeeLocked(AcsEmployeeFull employee) {
        if (employee == null) {
            return false;
        }
        return Boolean.FALSE.equals(employee.isIsLocked());
    }

    private static String getEmployeePositionName(AcsEmployeeFull employee) {
        if (employee == null || employee.getPosition() == null || employee.getPosition().getValue() == null) {
            return "";
        }
        if (employee.getPosition().getValue().getName() == null) {
            return "";
        }
        if (employee.getPosition().getValue().getName().getValue() == null) {
            return "";
        }
        return employee.getPosition().getValue().getName().getValue();
    }

    @SuppressWarnings("unchecked")
    private static <T> T getValue(Object obj, String methodName, Class<T> returnType) {
        try {
            Method m = obj.getClass().getMethod(methodName);
            Object result = m.invoke(obj);

            if (result == null) {
                return returnType.cast(""); // Return empty string or handle null as needed
            }

            if (result instanceof JAXBElement) {
                Object value = ((JAXBElement<?>) result).getValue();
                return returnType.cast(value != null ? value : "");
            }

            return returnType.cast(result);
        } catch (Exception e) {
            try {
                return returnType.getDeclaredConstructor().newInstance();
            } catch (Exception ex) {
                return null;
            }
        }
    }

    private static String getPositionName(Object fullEmployee) {
        String positionName = "";
        Object positionObj = getValue(fullEmployee, "getPosition", String.class);
        if (positionObj != null && !(positionObj instanceof String && positionObj.equals(""))) {
            if (positionObj instanceof JAXBElement) {
                Object positionValue = ((JAXBElement<?>) positionObj).getValue();
                if (positionValue != null) {
                    // Попробуем получить имя должности через getValue метод
                    Object nameValue = getValue(positionValue, "getName", String.class);
                    if (nameValue != null && !nameValue.toString().isEmpty() && !(nameValue instanceof String && nameValue.equals(""))) {
                        positionName = nameValue.toString();
                    } else {
                        // Если getName не сработал, пробуем другие возможные методы
                        try {
                            Method[] methods = positionValue.getClass().getMethods();
                            for (Method method : methods) {
                                if (method.getName().toLowerCase().contains("name") && method.getParameterCount() == 0) {
                                    Object result = method.invoke(positionValue);
                                    if (result != null) {
                                        positionName = result.toString();
                                        break;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            // Если не удалось получить название, возвращаем toString() объекта
                            positionName = positionValue.toString();
                        }
                    }
                }
            } else {
                positionName = positionObj != null ? positionObj.toString() : "";
            }
        }
        return positionName;
    }

    public static AcsEmployeeFull getAcsEmployee(String id) {
        try {
            return networkService.getAcsEmployee(String.valueOf(UUID.fromString(id)));
        } catch (Exception e) {
//            System.err.println("Ошибка получения полных данных сотрудника: " + e.getMessage());
            return null;
        }
    }
    public static ArrayOfAcsEmployeeGroup getEmployeeGroups() {
        initServices();
        ArrayOfAcsEmployeeGroup temp_EmployeeGroups = networkService.getAcsEmployeeGroups();
//        temp_EmployeeGroups.getAcsEmployeeGroup().forEach(acsEmployeeGroup -> System.out.println(acsEmployeeGroup.getID() + " - " + acsEmployeeGroup.getName().getValue()));
        return temp_EmployeeGroups;
    }

    private static String getGroupName(String IDGroup) {
        AcsEmployeeGroup temp_EmployeeGroup = networkService.getAcsEmployeeGroup(IDGroup);

        String nameOrEmpty = temp_EmployeeGroup != null && !temp_EmployeeGroup.isIsRemoved() && temp_EmployeeGroup.getName() != null ? temp_EmployeeGroup.getName().getValue() : "Удалена: ";
        return nameOrEmpty;
    }

    public Map<String, Object> getEmployeeById(String id) {
        // Initialize response map
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            initServices();
            AcsEmployeeFull employee = getAcsEmployee(id);
            if (employee == null) {
                System.out.println("Сотрудник не найден");
                return new HashMap<>();
            }

            if (employee != null && !employee.getLastName().isNil()) {
                List<Map<String, Object>> employeesList = new ArrayList<>();

                Map<String, Object> empData = new LinkedHashMap<>();
                empData.put("ID", employee.getID());
                empData.put("GroupID", employee.getEmployeeGroupID() != null ? employee.getEmployeeGroupID() : "");
                empData.put("Group", !getGroupName(employee.getEmployeeGroupID()).isEmpty() ? getGroupName(employee.getEmployeeGroupID()) : "Группы отсутствует");
                empData.put("LastName", employee.getLastName() != null ? employee.getLastName().getValue() : "");
                empData.put("FirstName", employee.getFirstName() != null ? employee.getFirstName().getValue() : "");
                empData.put("SecondName", employee.getSecondName() != null ? employee.getSecondName().getValue() : "");

                if (employee.getPosition() != null) {
                    try {
                        Object position = employee.getPosition();
                        // Try to call getValue() method
//                        Method getValueMethod = position.getClass().getMethod("getValue");
//                        Object positionValue = getValueMethod.invoke(position);

                        if (!employee.getPosition().isNil()) {
                            empData.put("PositionID", employee.getPosition().getValue().getID());
                            empData.put("Position", employee.getPosition().getValue().getName().getValue());
                        }
                    } catch (Exception e) {
                        // Log the error for debugging
                        empData.put("PositionError", "Error getting position: " + e.getMessage());
                    }
                }
                empData.put("PassportIssue", employee.getPassportIssue() != null ? employee.getPassportIssue().getValue() : "");
                empData.put("PassportNumber", employee.getPassportNumber() != null ? employee.getPassportNumber().getValue() : "");
                empData.put("IsLocked", employee.isIsLocked() != null ? employee.isIsLocked() : false);

                employeesList.add(empData);

                response.put("status", "success");
                response.put("message", "Employee retrieved by ID successfully");
                response.put("id", id);
                response.put("data", employeesList);
                return response;
            }
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error retrieving employee: " + e.getMessage());
            response.put("id", id);
            return response;
        }


        return response;
    }

    @Override
    public Map<String, Object> getEmployeePassagesByDate(String IDEmployees, String dataPassages) {     //Проходы пользователя на дату формат -"MM-dd-yyyy"
        initServices();
        Map<String, Object> response = new LinkedHashMap<>();
        DateTimeFormatter formatterUS = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dataPassages, formatterUS);

        if (IDEmployees == null || IDEmployees.isBlank()) {
            throw new IllegalArgumentException("employeeId is blank");
        }
        if (dataPassages == null) {
            throw new IllegalArgumentException("date is null");
        }

        System.out.println("Поиск проходов/событий сотрудника за дату: " + localDate.toString() + ", employeeId=" + IDEmployees);

        try {
            ArrayOfguid subjectIDs = new ArrayOfguid();
            subjectIDs.getGuid().add(String.valueOf(UUID.fromString(IDEmployees)));

            ZoneId zoneId = ZoneId.systemDefault();
            LocalDateTime startLdt = localDate.atStartOfDay();
            LocalDateTime endExclusiveLdt = localDate.plusDays(1).atStartOfDay();

            XMLGregorianCalendar fromDateTime = toXmlGregorianCalendar(ZonedDateTime.of(startLdt, zoneId));
            XMLGregorianCalendar toDateTime = toXmlGregorianCalendar(ZonedDateTime.of(endExclusiveLdt, zoneId));

            LogData logData = networkService.getEvents(
                    0L,
                    fromDateTime,
                    toDateTime,
                    null,
                    null,
                    subjectIDs,
                    LogSubjectType.EMPLOYEE,
                    0,
                    1000,
                    LogMessageSortedColumn.DATE_TIME,
                    SortOrder.ASCENDING
            );

            if (logData == null || logData.getMessages() == null || logData.getMessages().getValue() == null
                    || logData.getMessages().getValue().getLogMessage() == null
                    || logData.getMessages().getValue().getLogMessage().isEmpty()) {
                System.out.println("Проходы/события не найдены");
                return null; //TODO
            }

            List<LogMessage> messages = logData.getMessages().getValue().getLogMessage();
            System.out.println("Найдено событий: " + messages.size());


            List<Map<String, Object>> employeesList = new ArrayList<>();
            //!!!
            for (LogMessage msg : messages) {
                if (msg == null) {
                    continue;
                }
                Map<String, Object> empData = new LinkedHashMap<>();
                empData.put("ID", msg.getEmployeeID().getValue());

                empData.put("DataTime", msg.getDateTime().getDay() + "-" + msg.getDateTime().getMonth() + "-" + msg.getDateTime().getYear() + " " + msg.getDateTime().getHour() + ":" + msg.getDateTime().getMinute() + ":" + msg.getDateTime().getSecond());
                empData.put("TYPE", msg.getLogMessageType());
                empData.put("SUBTYPE", msg.getLogMessageSubType());
                empData.put("MESSAGE", (msg.getMessage() != null ? msg.getMessage().getValue() : ""));
                employeesList.add(empData);


                response.put("status", "success");
                response.put("message", "Employee retrieved by ID successfully");
                response.put("id", IDEmployees);
                response.put("fio", msg.getEmployeeLastName().getValue() + " " + msg.getEmployeeFirstName().getValue() + " " + msg.getEmployeeLastName().getValue());
                response.put("department", msg.getEmployeeGroupName().getValue());
                response.put("data", employeesList);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }

    private static XMLGregorianCalendar toXmlGregorianCalendar(ZonedDateTime zdt) {
        try {
            GregorianCalendar gc = GregorianCalendar.from(zdt);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Object> GetEmployeesByTabelNumber(String tabelNumber) {
        initServices();
        Map<String, Object> response = new LinkedHashMap<>();

        Integer intTabelNumber = Integer.valueOf(tabelNumber);

        ArrayOfint arrayTabelNumber = new ArrayOfint();
        arrayTabelNumber.getInt().add(intTabelNumber);
        ArrayOfAcsEmployeeFull arrayOfAcsEmployeeFull = networkService.getAcsEmployeesByTableNumbers(arrayTabelNumber);
        if (arrayOfAcsEmployeeFull.getAcsEmployeeFull().size() == 0) {
            return response;
        }

        //Формируем ответ
        List<Map<String, Object>> employeesList = new ArrayList<>();
        for (AcsEmployeeFull AcsEmployee : arrayOfAcsEmployeeFull.getAcsEmployeeFull()) {
            if (AcsEmployee == null) {
                continue;
            }
            Map<String, Object> empData = new LinkedHashMap<>();
            empData.put("ID", AcsEmployee.getID());
            empData.put("GroupID", AcsEmployee.getEmployeeGroupID());
            empData.put("LastName", AcsEmployee.getLastName().getValue());
            empData.put("FirstName", AcsEmployee.getFirstName().getValue());
            empData.put("SecondName", AcsEmployee.getSecondName().getValue());
            empData.put("Position", AcsEmployee.getPosition().getValue().getName().getValue());
            empData.put("TabNumber", AcsEmployee.getNumber().getValue());
            empData.put("PassportIssue", AcsEmployee.getPassportIssue().getValue());
            empData.put("PassportNumber", AcsEmployee.getPassportNumber().getValue());
            empData.put("IsLocked", AcsEmployee.isIsLocked());
            empData.put("IsRemoved()", AcsEmployee.isIsRemoved());

            employeesList.add(empData);


            response.put("status", "success");
            response.put("message", "Employee retrieved by TabNumber successfully");
            response.put("tabNumber", tabelNumber);
            response.put("IDEmployee", arrayOfAcsEmployeeFull.getAcsEmployeeFull().iterator().next().getID());
            response.put("data", employeesList);

        }

        return response;
    }

    public Map<String, Object> addEmailEmployee(String IDEmployee, String email, String description) throws ILNetworkConfigurationServiceAddEmailAddressDataAlreadyExistsExceptionFaultFaultMessage {
        initServices();
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("ID", IDEmployee);
        response.put("E_mail", email);
        response.put("Description", description);
        {
            // 🔒 Валидация входных данных
            if (IDEmployee == null || IDEmployee.trim().isEmpty()) {
                throw new IllegalArgumentException("IDEmployee cannot be null or empty");
            }
            if (email == null || email.trim().isEmpty()) {
                throw new IllegalArgumentException("Email cannot be null or empty");
            }
            if (description == null) {
                description = "";
            }

            // 🔍 Получаем namespace динамически (без жёсткого кодирования)
            String namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation";
            // ✅ Создаём все элементы через JAXBElement с правильным namespace
            JAXBElement<String> emailElement = new JAXBElement<>(
                    new QName(namespace, "Email"),
                    String.class,
                    email
            );
            JAXBElement<String> descriptionElement = new JAXBElement<>(
                    new QName(namespace, "Description"),
                    String.class,
                    description
            );
            Integer emailOrderElement = 1;

            // ✅ Собираем объект
            EmailAddressSaveData data = new EmailAddressSaveData();
            data.setEmail(emailElement);
            data.setDescription(descriptionElement);
            data.setEmailOrder(emailOrderElement); // ✅ Важно: не setEmailOrder(1)!

            // 🔍 Проверка сервиса
            if (networkCnfgService == null) {
                throw new IllegalStateException("Network configuration service is not initialized");
            }
            // ✅ Вызов сервиса с обработкой исключений
            try {
                networkCnfgService.addEmailAddress(
                        EmailAddressOwner.EMPLOYEE,
                        IDEmployee,
                        data,
                        true
                );
                System.out.printf("Email %s successfully added for employee %s", email, IDEmployee);
            } catch (ILNetworkConfigurationServiceAddEmailAddressDataAlreadyExistsExceptionFaultFaultMessage e) {
                System.out.printf("Email %s already exists for employee %s", email, IDEmployee);
                throw e;
            } catch (Exception e) {
                System.out.printf("Failed to add email %s for employee %s: %s, %s", email, IDEmployee, e.getMessage(), e);
                throw new RuntimeException("Failed to add email: " + e.getMessage(), e);
            }
        }
        return response;
    }

    public Map<String, Object> addEmployee(String firstname, String lastname, String secondname, Integer tabelNumber, String position, String positionGroup, String Comment, String AdressReg, String PassportIISUE, String PassportNumber, String email, String emailDescription) throws ILNetworkConfigurationServiceAddEmailAddressDataAlreadyExistsExceptionFaultFaultMessage {
        initServices();
        Map<String, Object> response = new LinkedHashMap<>();

        response.put("FirstName", firstname);
        response.put("LastName", lastname);
        response.put("SecondName", secondname);
        response.put("TabelNumber", tabelNumber);
        response.put("Position", position);
        response.put("PositionGroup", positionGroup);
        response.put("Comment", Comment);
        response.put("AdressReg", AdressReg);
        response.put("PassportIISUE", PassportIISUE);
        response.put("PassportNumber", PassportNumber);


        QName EMPLOYEE_POSITION_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "EmployeePositionID"
        );
        QName EMPLOYEE_FIRSTNAME_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "FirstName"
        );
        QName EMPLOYEE_LASTNAME_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "LastName"
        );
        QName EMPLOYEE_SECONDNAME_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "SecondName"
        );
        QName EMPLOYEE_COMMENT_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "Comment"
        );
        QName EMPLOYEE_ADRESSREG_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "RegistrationAddress"
        );
        QName EMPLOYEE_NUMBER_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "Number"
        );
        QName EMPLOYEE_PASPORTIISUE_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "PassportIssue"
        );
        QName EMPLOYEE_PASPORTNOMBER_ID_QNAME = new QName(
                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                "PassportNumber"
        );

        AcsEmployeeSaveData employeeData = new AcsEmployeeSaveData(); // Создаём объект данных сотрудника
        // ✅ Оборачиваем в JAXBElement
        JAXBElement<String> employeePositionID = new JAXBElement<>(
                EMPLOYEE_POSITION_ID_QNAME,   // Имя и пространство имён элемента
                String.class,                 // Тип значения
                position                       // Значение — ID должности из вашей системы
        );
        JAXBElement<String> employeeFirstName = new JAXBElement<>(
                EMPLOYEE_FIRSTNAME_ID_QNAME,
                String.class,
                firstname
        );
        JAXBElement<String> employeeLastName = new JAXBElement<>(
                EMPLOYEE_LASTNAME_ID_QNAME,
                String.class,
                lastname
        );
        JAXBElement<String> employeeSecondName = new JAXBElement<>(
                EMPLOYEE_SECONDNAME_ID_QNAME,
                String.class,
                secondname
        );
        JAXBElement<String> employeeComment = new JAXBElement<>(
                EMPLOYEE_COMMENT_ID_QNAME,
                String.class,
                Comment
        );
        JAXBElement<String> employeeAdressReg = new JAXBElement<>(
                EMPLOYEE_ADRESSREG_ID_QNAME,
                String.class,
                AdressReg
        );
        JAXBElement<String> employeePassportIISUE = new JAXBElement<>(
                EMPLOYEE_PASPORTIISUE_ID_QNAME,
                String.class,
                PassportIISUE
        );
        JAXBElement<String> employeePassportNumber = new JAXBElement<>(
                EMPLOYEE_PASPORTNOMBER_ID_QNAME,
                String.class,
                PassportNumber
        );
        JAXBElement<Integer> employeeNumber = new JAXBElement<>(
                EMPLOYEE_NUMBER_ID_QNAME,
                Integer.class,
                tabelNumber
        );
        // ✅ Устанавливаем другие поля (опционально)
        employeeData.setEmployeePositionID(employeePositionID);
        employeeData.setIsChangeLocked(true);   // true — запретить изменение
        employeeData.setIsChangePin(false);     // false — не требовать смены PIN
        employeeData.setFirstName(employeeFirstName);
        employeeData.setLastName(employeeLastName);
        employeeData.setSecondName(employeeSecondName);
        employeeData.setNumber(employeeNumber);
        employeeData.setEmployeePositionID(employeePositionID);
        employeeData.setComment(employeeComment);
        employeeData.setRegistrationAddress(employeeAdressReg);
        employeeData.setPassportIssue(employeePassportIISUE);
        employeeData.setPassportNumber(employeePassportNumber);

        // ✅ Вызываем сервис
        AcsEmployeeSlim result = new AcsEmployeeSlim();
        try {
            result = networkCnfgService.addAcsEmployee(positionGroup, employeeData); //создаем пользователя
            addEmailEmployee(result.getID(), email, emailDescription); // добавляем почту
        } catch (ILNetworkConfigurationServiceAddAcsEmployeeArgumentNullExceptionFaultFaultMessage e) {
            System.err.println("Ошибка: обязательное поле не передано — " + e.getFaultInfo().toString());
        } catch (ILNetworkConfigurationServiceAddAcsEmployeeDataAlreadyExistsExceptionFaultFaultMessage e) {
            System.err.println("Ошибка: сотрудник с такими данными уже существует — " + e.getFaultInfo().toString());
        } catch (ILNetworkConfigurationServiceAddAcsEmployeeDataNotFoundExceptionFaultFaultMessage e) {
            System.err.println("Ошибка: группа или должность не найдены — " + e.getFaultInfo().toString());
        } catch (Exception e) {
            System.err.println("Неожиданная ошибка: " + e.getMessage());
        }
        return response;
    }

    public Map<String, Object> saveAcsEmployee(String idEmployee, SaveAcsEmployeeRequest request) {
        initServices();
        AcsEmployeeFull currentEmployee = networkService.getAcsEmployee(idEmployee);
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            // Валидация обязательного поля
            if (idEmployee == null || idEmployee.trim().isEmpty()) {
                throw new IllegalArgumentException("idEmployee is required");
            }

            // Создание объекта данных
            AcsEmployeeSaveData data = new AcsEmployeeSaveData();

            // Установка имени (обязательно для RusGuard)
            // Если передано в запросе - используем, иначе используем текущие данные
            if (request.getFirstName() != null && !request.getFirstName().trim().isEmpty()) {
                QName firstNameQName = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "FirstName"
                );
                JAXBElement<String> firstNameElement =
                        new JAXBElement<>(firstNameQName, String.class, request.getFirstName().trim());
                data.setFirstName(firstNameElement);
            }
            // Если не передано, проверяем, есть ли текущие данные сотрудника
            else {
                try {
                    // Пытаемся получить текущие данные

                    if (currentEmployee != null && currentEmployee.getFirstName() != null) {
                        data.setFirstName(currentEmployee.getFirstName());
                    } else {
                        // Задаем значение по умолчанию
                        QName firstNameQName = new QName(
                                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                                "FirstName"
                        );
                        JAXBElement<String> firstNameElement =
                                new JAXBElement<>(firstNameQName, String.class, "Имя");
                        data.setFirstName(firstNameElement);
                    }
                } catch (Exception e) {
                    // Если не удалось получить данные, задаем значение по умолчанию
                    QName firstNameQName = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "FirstName"
                    );
                    JAXBElement<String> firstNameElement =
                            new JAXBElement<>(firstNameQName, String.class, "Имя");
                    data.setFirstName(firstNameElement);
                }
            }

            // Установка фамилии (аналогично)
            // Если передано в запросе - используем, иначе используем текущие данные
            if (request.getLastName() != null && !request.getLastName().trim().isEmpty()) {
                QName lastNameQName = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "LastName"
                );
                JAXBElement<String> lastNameElement =
                        new JAXBElement<>(lastNameQName, String.class, request.getLastName().trim());
                data.setLastName(lastNameElement);
            } else {
                // Пытаемся получить текущие данные или задаем по умолчанию
                try {

                    if (currentEmployee != null && currentEmployee.getLastName() != null) {
                        data.setLastName(currentEmployee.getLastName());
                    } else {
                        QName lastNameQName = new QName(
                                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                                "LastName"
                        );
                        JAXBElement<String> lastNameElement =
                                new JAXBElement<>(lastNameQName, String.class, "Фамилия");
                        data.setLastName(lastNameElement);
                    }
                } catch (Exception e) {
                    QName lastNameQName = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "LastName"
                    );
                    JAXBElement<String> lastNameElement =
                            new JAXBElement<>(lastNameQName, String.class, "Фамилия");
                    data.setLastName(lastNameElement);
                }
            }

            // SecondName (необязательное)
            if (request.getSecondName() != null && !request.getSecondName().trim().isEmpty()) {
                QName secondNameQName = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "SecondName"
                );
                JAXBElement<String> secondNameElement =
                        new JAXBElement<>(secondNameQName, String.class, request.getSecondName().trim());
                data.setSecondName(secondNameElement);
            } else {
                // Пытаемся получить текущие данные или задаем по умолчанию
                try {
                    if (currentEmployee != null && currentEmployee.getSecondName() != null) {
                        data.setSecondName(currentEmployee.getSecondName());
                    } else {
                        QName secondNameQName = new QName(
                                "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                                "SecondName"
                        );
                        JAXBElement<String> secondNameElement =
                                new JAXBElement<>(secondNameQName, String.class, "Отчество");
                        data.setLastName(secondNameElement);
                    }
                } catch (Exception e) {
                    QName secondNameQName = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "SecondName"
                    );
                    JAXBElement<String> secondNameElement =
                            new JAXBElement<>(secondNameQName, String.class, "Отчество");
                    data.setLastName(secondNameElement);
                }
            }

            // табельный номер (может быть null)
            if (request.getTabelNumber() != null) {

                QName numberQName = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "Number"
                );
                JAXBElement<Integer> numberElement =
                        new JAXBElement<>(numberQName, Integer.class, request.getTabelNumber());
                data.setNumber(numberElement);
            } else {
                assert currentEmployee != null;
//TODO проверить если в текушем объекте пусто!
                data.setNumber(currentEmployee.getNumber());
            }
            AcsEmployeeSaveData fullEmployee = new AcsEmployeeSaveData(); // Создаём объект данных сотрудника
            String positionName = "";
            // EmployeePositionID (если передан)
            if (request.getPosition() != null && !request.getPosition().trim().isEmpty()) {
                Object positionObj = getValue(fullEmployee, "getPosition");
                if (positionObj != null && !(positionObj instanceof String && positionObj.equals(""))) {
                    if (positionObj instanceof JAXBElement) {
                        Object positionValue = ((JAXBElement<?>) positionObj).getValue();
                        if (positionValue != null) {
                            // Попробуем получить имя должности через getValue метод
                            Object nameValue = getValue(positionValue, "getName");
                            if (nameValue != null && !nameValue.toString().isEmpty() && !(nameValue instanceof String && nameValue.equals(""))) {
                                positionName = nameValue.toString();
                            } else {
                                // Если getName не сработал, пробуем другие возможные методы
                                try {
                                    Method[] methods = positionValue.getClass().getMethods();
                                    for (Method method : methods) {
                                        if (method.getName().toLowerCase().contains("name") && method.getParameterCount() == 0) {
                                            Object result = method.invoke(positionValue);
                                            if (result != null) {
                                                positionName = result.toString();
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    // Если не удалось получить название, возвращаем toString() объекта
                                    positionName = positionValue.toString();
                                }
                            }
                        }
                    } else {
                        positionName = positionObj != null ? positionObj.toString() : "";
                    }
                } else {
                    // Создаем объект LEmployeePositionInfo для передачи в качестве JAXBElement
                    QName EMPLOYEE_POSITION_ID_QNAME = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "EmployeePositionID"
                    );
                    JAXBElement<String> employeePositionID = new JAXBElement<>(
                            EMPLOYEE_POSITION_ID_QNAME,   // Имя и пространство имён элемента
                            String.class,                 // Тип значения
                            request.getPosition()                       // Значение — ID должности из вашей системы
                    );
                    assert currentEmployee != null;
                    data.setEmployeePositionID(employeePositionID);
                }
            }
            // Boolean поля (только если переданы)
            if (request.getIsChangeLocked() != null) {
                data.setIsChangeLocked(request.getIsChangeLocked());
            }
            if (request.getIsChangePin() != null) {
                data.setIsChangePin(request.getIsChangePin());
            }

            // Комментарий: Если передано в запросе - используем, иначе используем текущие данные
            QName EMPLOYEE_COMMENT_ID_QNAME;
            JAXBElement<String> employeeComment;
            if (request.getComment() != null && !request.getComment().trim().isEmpty()) {
                EMPLOYEE_COMMENT_ID_QNAME = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "Comment"
                );
                employeeComment = new JAXBElement<>(
                        EMPLOYEE_COMMENT_ID_QNAME,
                        String.class,
                        request.getComment()
                );
                data.setComment(employeeComment);
            } else {
                try {
                    if (currentEmployee != null && currentEmployee.getComment() != null) {// Пытаемся получить текущие данные или задаем по умолчанию
                        data.setComment(currentEmployee.getComment());
                    }
                } catch (Exception e) {
                    EMPLOYEE_COMMENT_ID_QNAME = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "Comment"
                    );
                    employeeComment = new JAXBElement<>(
                            EMPLOYEE_COMMENT_ID_QNAME,
                            String.class,
                            "-"
                    );
                    data.setComment(employeeComment);
                }
            }

            // Адрес Регистрации: Если передано в запросе - используем, иначе используем текущие данные
            QName EMPLOYEE_ADRESSREG_ID_QNAME;
            JAXBElement<String> employeeAdressReg;
            if (request.getComment() != null && !request.getComment().trim().isEmpty()) {
                EMPLOYEE_ADRESSREG_ID_QNAME = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "RegistrationAddress"
                );
                employeeAdressReg = new JAXBElement<>(
                        EMPLOYEE_ADRESSREG_ID_QNAME,
                        String.class,
                        request.getRegistrationAddress()
                );
                data.setRegistrationAddress(employeeAdressReg);
            } else {
                try {
                    if (currentEmployee != null && currentEmployee.getRegistrationAddress() != null) {// Пытаемся получить текущие данные или задаем по умолчанию
                        data.setRegistrationAddress(currentEmployee.getRegistrationAddress());
                    }
                } catch (Exception e) {
                    EMPLOYEE_ADRESSREG_ID_QNAME = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "RegistrationAddress"
                    );
                    employeeAdressReg = new JAXBElement<>(
                            EMPLOYEE_ADRESSREG_ID_QNAME,
                            String.class,
                            request.getRegistrationAddress()
                    );
                    data.setRegistrationAddress(employeeAdressReg);
                }
            }

            // Адрес проживания: Если передано в запросе - используем, иначе используем текущие данные
            QName EMPLOYEE_ADRESSRSDL_ID_QNAME;
            JAXBElement<String> employeeAdressRsdl;
            if (request.getResidentialAddress() != null && !request.getResidentialAddress().trim().isEmpty()) {
                EMPLOYEE_ADRESSRSDL_ID_QNAME = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "ResidentialAddress"
                );
                employeeAdressRsdl = new JAXBElement<>(
                        EMPLOYEE_ADRESSRSDL_ID_QNAME,
                        String.class,
                        request.getResidentialAddress()
                );
                data.setResidentialAddress(employeeAdressRsdl);
            } else {
                try {
                    if (currentEmployee != null && currentEmployee.getResidentialAddress() != null) {// Пытаемся получить текущие данные или задаем по умолчанию
                        data.setResidentialAddress(currentEmployee.getResidentialAddress());
                    }
                } catch (Exception e) {
                    EMPLOYEE_ADRESSRSDL_ID_QNAME = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "ResidentialAddress"
                    );
                    employeeAdressRsdl = new JAXBElement<>(
                            EMPLOYEE_ADRESSRSDL_ID_QNAME,
                            String.class,
                            request.getResidentialAddress()
                    );
                    data.setResidentialAddress(employeeAdressRsdl);
                }
            }
            // Паспорт серия: Если передано в запросе - используем, иначе используем текущие данные
            QName EMPLOYEE_PASPORTIISUE_ID_QNAME;
            JAXBElement<String> employeePassportIISUE;
            if (request.getPassportIISUE() != null && !request.getPassportIISUE().trim().isEmpty()) {
                EMPLOYEE_PASPORTIISUE_ID_QNAME = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "PassportIssue"
                );
                employeePassportIISUE = new JAXBElement<>(
                        EMPLOYEE_PASPORTIISUE_ID_QNAME,
                        String.class,
                        request.getPassportIISUE()
                );
                data.setPassportIssue(employeePassportIISUE);
            } else {
                try {
                    if (currentEmployee != null && currentEmployee.getPassportIssue() != null) {// Пытаемся получить текущие данные или задаем по умолчанию
                        data.setPassportIssue(currentEmployee.getPassportIssue());
                    }
                } catch (Exception e) {
                    EMPLOYEE_PASPORTIISUE_ID_QNAME = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "PassportIssue"
                    );
                    employeePassportIISUE = new JAXBElement<>(
                            EMPLOYEE_PASPORTIISUE_ID_QNAME,
                            String.class,
                            request.getPassportIISUE()
                    );
                    data.setPassportIssue(employeePassportIISUE);
                }
            }

            // Паспорт номер: Если передано в запросе - используем, иначе используем текущие данные
            QName EMPLOYEE_PASPORTNOMBER_ID_QNAME;
            JAXBElement<String> employeePassportNumber;
            if (request.getPassportNumber() != null && !request.getPassportNumber().trim().isEmpty()) {
                EMPLOYEE_PASPORTNOMBER_ID_QNAME = new QName(
                        "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                        "PassportNumber"
                );
                employeePassportNumber = new JAXBElement<>(
                        EMPLOYEE_PASPORTNOMBER_ID_QNAME,
                        String.class,
                        request.getPassportNumber()
                );
                data.setPassportNumber(employeePassportNumber);
            } else {
                try {
                    if (currentEmployee != null && currentEmployee.getPassportNumber() != null) {// Пытаемся получить текущие данные или задаем по умолчанию
                        data.setPassportNumber(currentEmployee.getPassportNumber());
                    }
                } catch (Exception e) {
                    EMPLOYEE_PASPORTNOMBER_ID_QNAME = new QName(
                            "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees",
                            "PassportNumber"
                    );
                    employeePassportNumber = new JAXBElement<>(
                            EMPLOYEE_PASPORTNOMBER_ID_QNAME,
                            String.class,
                            request.getPassportNumber()
                    );
                    data.setPassportNumber(employeePassportNumber);
                }
            }
            networkCnfgService.saveAcsEmployee(idEmployee, data);
            response.put("status", "success");
            response.put("message", "Employee data updated successfully");
            // Добавляем в ответ только те поля, которые были обновлены
            if (request.getPosition() != null) {
                response.put("idPosition", request.getPosition());
            }
            if (request.getIsChangeLocked() != null) {
                response.put("isChangeLocked", request.getIsChangeLocked());
            }
            if (request.getIsChangePin() != null) {
                response.put("isChangePin", request.getIsChangePin());
            }
            if (request.getFirstName() != null) {
                response.put("firstName", request.getFirstName());
            }
            if (request.getLastName() != null) {
                response.put("lastName", request.getLastName());
            }
            if (request.getSecondName() != null) {
                response.put("secondName", request.getSecondName());
            }
            if (request.getTabelNumber() != null) {
                response.put("tabelNumber", request.getTabelNumber());
            }
            if (request.getComment() != null) {
                response.put("Comment", request.getComment());
            }
            if (request.getRegistrationAddress() != null) {
                response.put("RegistrationAddress", request.getRegistrationAddress());
            }
            if (request.getResidentialAddress() != null) {
                response.put("ResidentialAddress", request.getResidentialAddress());
            }
            if (request.getRegistrationAddress() != null) {
                response.put("PassportIISUE", request.getPassportIISUE());
            }
            if (request.getRegistrationAddress() != null) {
                response.put("PassportNumber", request.getPassportNumber());
            }

            // Почта: Если передано в запросе - используем, иначе используем текущие данные
            QName EMPLOYEE_MAIL_ID_QNAME = new QName(
                    "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation",
                    "Email"
            );
            JAXBElement<String> employeeMail = new JAXBElement<>(
                    EMPLOYEE_MAIL_ID_QNAME,
                    String.class,
                    request.getEmail()
            );

            if (request.getEmail() != null && !request.getEmail().trim().isEmpty()) {
                String email = request.getEmail().trim();
                String emailDescription = request.getEmailDescription() != null ?
                        request.getEmailDescription().trim() : "";

                System.out.println("DEBUG: Adding email for employee " + idEmployee);
                System.out.println("DEBUG: Email = " + email);
                System.out.println("DEBUG: Email Description = " + emailDescription);

                try {
                    // Создаем объект EmailAddressSaveData
                    org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.EmailAddressSaveData dataEmail =
                            new org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.EmailAddressSaveData();

                    // Email - ОБЯЗАТЕЛЬНОЕ поле
                    String emailNamespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation";
                    QName emailQName = new QName(emailNamespace, "Email");
                    JAXBElement<String> emailElement = new JAXBElement<>(emailQName, String.class, email);
                    dataEmail.setEmail(emailElement);

                    // Description - необязательное поле
                    if (emailDescription != null && !emailDescription.isEmpty()) {
                        QName descQName = new QName(emailNamespace, "Description");
                        JAXBElement<String> descElement = new JAXBElement<>(descQName, String.class, emailDescription);
                        dataEmail.setDescription(descElement);
                    }

                    // EmailOrder - установите нужное значение (обычно 1 для первого email)
                    dataEmail.setEmailOrder(request.getEmailOrder());

                    // Проверка перед вызовом
                    if (dataEmail.getEmail() == null || dataEmail.getEmail().getValue() == null) {
                        throw new IllegalArgumentException("Email must not be null");
                    }

                    System.out.println("DEBUG: Calling saveEmailAddress...");
                    System.out.println(UUID.fromString(idEmployee));

//                    networkCnfgService.saveEmailAddress(idEmployee, dataEmail, true);
                    networkCnfgService.addEmailAddress(EmailAddressOwner.EMPLOYEE, idEmployee, dataEmail, true); //добавляет, но не обновляет данные!!! (нужно - TRUE)
                    if (request.getEmail() != null) {
                        response.put("Email", request.getEmail());
                    }
                    if (request.getEmailDescription() != null) {
                        response.put("emailDescription", request.getEmailDescription());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    response.put("emailError", "Failed to add email " + email + " for employee " + idEmployee + ": " + e.getMessage());
                    response.put("emailDescription", "An error occurred while adding the email. The specified email may already exist");
//                    throw new RuntimeException("Failed to add email: " + e.getMessage(), e);
                }
            }
        } catch (Exception e) {
            response.put("status", "failed");
            response.put("message", "Error updating employee");
            response.put("error", e.getMessage());

            // Детальная обработка ошибок
            if (e.getMessage().contains("Должно быть задано имя, фамилия или отчество сотрудника")) {
                response.put("diagnostic", "Employee must have at least one of: firstName, lastName, middleName");
            }
        }

        return response;
    }

}