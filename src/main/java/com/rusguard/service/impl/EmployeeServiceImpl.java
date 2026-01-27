package com.rusguard.service.impl;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.rusguard.service.EmployeeService;


import jakarta.xml.bind.JAXBElement;
import jakarta.xml.ws.BindingProvider;
//import jdk.dynalink.TypeConverterFactory;
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
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.LogMessage;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.LogMessageSortedColumn;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.LogSubjectType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsEmployee;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsEmployeeFull;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.ArrayOfAcsEmployee;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.SearchCondition;
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

import static java.util.Comparator.nullsFirst;

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

        // Set the properties in the request context
        requestContext.put(WSHandlerConstants.USERNAME_TOKEN, USERNAME);
        requestContext.put(WSHandlerConstants.PASSWORD_TYPE, PASSWORD);
        requestContext.put(WSHandlerConstants.ADD_USERNAMETOKEN_NONCE, "true");
        requestContext.put(WSHandlerConstants.ADD_USERNAMETOKEN_CREATED, "true");

        // Set the security properties
        requestContext.put(SecurityConstants.USERNAME, USERNAME);
        requestContext.put(SecurityConstants.PASSWORD, PASSWORD);
        requestContext.put(SecurityConstants.CALLBACK_HANDLER, new CallbackHandler() {
            @Override
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
                pc.setPassword(PASSWORD);
            }
        });

        // Add the security interceptor
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
            StringBuilder positionName = new StringBuilder();
            if (!employee.getPosition().isNil()) {
                positionName.append(employee.getPosition().getValue().getName().getValue()); //Должность
            }
// Process results
            if (employee != null && !employee.getLastName().isNil()) {
                List<Map<String, Object>> employeesList = new ArrayList<>();

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
    public Map<String, Object> getEmployeePassagesByDate(String IDEmployees, String dataPassages) {     //формат -"MM-dd-yyyy"
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
            com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid subjectIDs = new com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid();
            subjectIDs.getGuid().add(String.valueOf(UUID.fromString(IDEmployees)));

            ZoneId zoneId = ZoneId.systemDefault();
            LocalDateTime startLdt = localDate.atStartOfDay();
            LocalDateTime endExclusiveLdt = localDate.plusDays(1).atStartOfDay();

            XMLGregorianCalendar fromDateTime = toXmlGregorianCalendar(ZonedDateTime.of(startLdt, zoneId));
            XMLGregorianCalendar toDateTime = toXmlGregorianCalendar(ZonedDateTime.of(endExclusiveLdt, zoneId));

            org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.LogData logData = networkService.getEvents(
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

            java.util.List<LogMessage> messages = logData.getMessages().getValue().getLogMessage();
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
}