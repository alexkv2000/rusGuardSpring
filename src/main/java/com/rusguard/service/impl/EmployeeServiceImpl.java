package com.rusguard.service.impl;

import com.rusguard.service.EmployeeService;


import jakarta.xml.bind.JAXBElement;
import jakarta.xml.ws.BindingProvider;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
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
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static jakarta.xml.bind.JAXBIntrospector.getValue;

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
            java.lang.reflect.Method m = obj.getClass().getMethod(methodName);
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
        requestContext.put(org.apache.cxf.ws.security.SecurityConstants.USERNAME, USERNAME);
        requestContext.put(org.apache.cxf.ws.security.SecurityConstants.PASSWORD, PASSWORD);
        requestContext.put(org.apache.cxf.ws.security.SecurityConstants.CALLBACK_HANDLER, new CallbackHandler() {
            @Override
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
                pc.setPassword(PASSWORD);
            }
        });

        // Add the security interceptor
        org.apache.cxf.endpoint.Client client = org.apache.cxf.frontend.ClientProxy.getClient(port);
        org.apache.cxf.endpoint.Endpoint cxfEndpoint = client.getEndpoint();

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

        org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor wssOut =
                new org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor(outProps);
        cxfEndpoint.getOutInterceptors().add(wssOut);
    }

    private static void configureCxfTls(Object port) {
        org.apache.cxf.endpoint.Client client = org.apache.cxf.frontend.ClientProxy.getClient(port);
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

//            BindingProvider bpTimeoutCfg = (BindingProvider) networkCnfgService;
//            bpTimeoutCfg.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, CONFIG_SERVICE_URL);
//            bpTimeoutCfg.getRequestContext().put("force.urlconnection.http.conduit", Boolean.TRUE);
//            bpTimeoutCfg.getRequestContext().put("javax.xml.ws.client.connectionTimeout", "10000");
//            bpTimeoutCfg.getRequestContext().put("javax.xml.ws.client.receiveTimeout", "30000");
//            bpTimeoutCfg.getRequestContext().put("jakarta.xml.ws.client.connectionTimeout", "10000");
//            bpTimeoutCfg.getRequestContext().put("jakarta.xml.ws.client.receiveTimeout", "30000");

            configureCxfTls(networkService);
//            configureCxfTls(networkCnfgService);

            // Configure WS-Security
            configureWSSecurity((BindingProvider) networkService);
//            configureWSSecurity((BindingProvider) networkCnfgService);

            System.out.println("Сервис успешно инициализирован");
        } catch (Exception e) {
            throw new RuntimeException("Не удалось инициализировать сервисы", e);
        }
    }

    // Метод для создания SOAP-клиента
    private ILNetworkService createClient() {
        try {
            // Загружаем WSDL из classpath
//            ClassLoader classLoader = getClass().getClassLoader();
//            URL wsdlUrl = classLoader.getResource("\\wsdl\\LNetworkServer\\LNetworkService.wsdl");

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
    public Map<String, Object> setEmployeeLocked(Map<String, Object> params) {
        // Здесь должна быть реализация вызова реального метода setEmployeeLocked
        // Используем классы из библиотеки для выполнения операции

        // Извлечение параметров
        String employeeId = (String) params.get("employeeId");
        Boolean locked = (Boolean) params.get("locked");

        // В реальной реализации здесь будет вызов соответствующего метода API
        // Пока что возвращаем заглушку с информацией о вызове

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Employee lock status updated successfully (stub implementation)");
        response.put("employeeId", employeeId);
        response.put("locked", locked);
        return response;
    }

    @Override
    public Map<String, Object> getEmployeesByGroupID(Map<String, String> params) {
        String groupId = params.get("groupId");

        try {
            // Создаем клиент
            ILNetworkService client = createClient();

            if (client == null) {
                Map<String, Object> response = new HashMap<>();
                response.put("status", "error");
                response.put("message", "Failed to create client connection");
                response.put("groupId", groupId);
                return response;
            }

            // Создаем параметры поиска
            SearchCondition searchParams = new SearchCondition();
            // Устанавливаем параметры поиска по группе

            // Выполняем вызов
            ArrayOfAcsEmployee result = client.findEmployees(searchParams);

            Map<String, Object> response = new HashMap<>();
            response.put("status", "success");
            response.put("message", "Employees retrieved by group ID successfully");
            response.put("groupId", groupId);
            response.put("data", result);
            return response;

        } catch (Exception e) {
            Map<String, Object> response = new HashMap<>();
            response.put("status", "error");
            response.put("message", "Error retrieving employees: " + e.getMessage());
            response.put("groupId", groupId);
            return response;
        }
    }

    @Override
    public Map<String, Object> getEmployeeByFIO(Map<String, String> params) {
        String firstName = params.get("firstName");
        String lastName = params.get("lastName");
        String middleName = params.get("secondName");

        System.setProperty("org.apache.cxf.stax.allowInsecureParser", "true");
        System.setProperty("ws-security.disable.wsm4j", "true");
        System.setProperty("ws-security.validate.token", "false");

        // Initialize response map
        Map<String, Object> response = new HashMap<>();

        try {
            // Create client and search condition
//            ILNetworkService client = createClient();
//            if (client == null) {
//                response.put("status", "error");
//                response.put("message", "Failed to create client connection");
//                return response;
//            }

            // Set up search condition
            SearchCondition searchCondition = new SearchCondition();
            searchCondition.setIsGlobalSearch(true);
            searchCondition.setIncludeRemoved(true);

            initServices();
            // Set up search parameters
            JAXBElement<String> lastNameElement = new JAXBElement<>(
                    new QName(NS_EMPLOYEES, "LastName"), String.class, lastName);
            searchCondition.setLastName(lastNameElement);

            JAXBElement<String> firstNameElement = new JAXBElement<>(
                    new QName(NS_EMPLOYEES, "FirstName"), String.class, firstName);
            searchCondition.setFirstName(firstNameElement);

            JAXBElement<String> secondNameElement = new JAXBElement<>(
                    new QName(NS_EMPLOYEES, "SecondName"), String.class, middleName);
            searchCondition.setSecondName(secondNameElement);

            // Execute search
            System.out.println("Выполнение поиска сотрудников...");
            ArrayOfAcsEmployee result = networkService.findEmployees(searchCondition);

            // Process results
            if (result != null && result.getAcsEmployee() != null && !result.getAcsEmployee().isEmpty()) {
                List<Map<String, Object>> employeesList = new ArrayList<>();

                // First collect all employees with their full data
                for (AcsEmployee employee : result.getAcsEmployee()) {
                    AcsEmployeeFull fullEmployee = getAcsEmployee(employee.getEmployeeID());
                    if (fullEmployee != null) {
                        Map<String, Object> empData = new LinkedHashMap<>();
                        empData.put("ID", fullEmployee.getID());
                        empData.put("LastName", fullEmployee.getLastName() != null ? fullEmployee.getLastName().getValue() : "");
                        empData.put("FirstName", fullEmployee.getFirstName() != null ? fullEmployee.getFirstName().getValue() : "");
                        empData.put("SecondName", fullEmployee.getSecondName() != null ? fullEmployee.getSecondName().getValue() : "");
                        if (fullEmployee.getPosition() != null) {
                            try {
                                Object position = fullEmployee.getPosition();
                                // Try to call getValue() method
                                java.lang.reflect.Method getValueMethod = position.getClass().getMethod("getValue");
                                Object positionValue = getValueMethod.invoke(position);

                                if (positionValue != null) {
                                    // Now try to get the name from the position value
                                    java.lang.reflect.Method getNameMethod = positionValue.getClass().getMethod("getName");
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

                // Sort the list
                employeesList.sort((e1, e2) -> {
                    // First by IsLocked (false first)
                    boolean locked1 = (Boolean) e1.get("IsLocked");
                    boolean locked2 = (Boolean) e2.get("IsLocked");
                    if (locked1 != locked2) {
                        return Boolean.compare(locked1, locked2);
                    }
                    // Then by LastName
                    return ((String) e1.get("LastName")).compareToIgnoreCase((String) e2.get("LastName"));
                });

                response.put("status", "success");
                response.put("data", employeesList);
                response.put("count", employeesList.size());
            } else {
                response.put("status", "not_found");
                response.put("message", "No employees found");
                response.put("data", Collections.emptyList());
                response.put("count", 0);
            }

        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Error searching employees: " + e.getMessage());
            e.printStackTrace();
        }

        return response;
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
            java.lang.reflect.Method m = obj.getClass().getMethod(methodName);
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
                            java.lang.reflect.Method[] methods = positionValue.getClass().getMethods();
                            for (java.lang.reflect.Method method : methods) {
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
            System.err.println("Ошибка получения полных данных сотрудника: " + e.getMessage());
            return null;
        }
    }


    @Override
    public Map<String, Object> getEmployeeById(Map<String, String> params) {
        String id = params.get("id");

        try {
            // Создаем клиент
            ILNetworkService client = createClient();

            if (client == null) {
                Map<String, Object> response = new HashMap<>();
                response.put("status", "error");
                response.put("message", "Failed to create client connection");
                response.put("id", id);
                return response;
            }

            // Создаем параметры поиска
            SearchCondition searchParams = new SearchCondition();
            // Устанавливаем параметры поиска по ID

            // Выполняем вызов
            ArrayOfAcsEmployee result = client.findEmployees(searchParams);

            Map<String, Object> response = new HashMap<>();
            response.put("status", "success");
            response.put("message", "Employee retrieved by ID successfully");
            response.put("id", id);
            response.put("data", result);
            return response;

        } catch (Exception e) {
            Map<String, Object> response = new HashMap<>();
            response.put("status", "error");
            response.put("message", "Error retrieving employee: " + e.getMessage());
            response.put("id", id);
            return response;
        }
    }

    @Override
    public Map<String, Object> getEmployeePassagesByDate(Map<String, String> params) {
        String employeeId = params.get("employeeId");
        String date = params.get("date");

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Employee passages retrieved by date successfully (stub implementation)");
        response.put("employeeId", employeeId);
        response.put("date", date);
        response.put("data", new Object[]{});
        return response;
    }
}