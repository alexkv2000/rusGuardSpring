package com.rusguard.service;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.rusguard.client.ILNetworkConfigurationServiceAddEmailAddressDataAlreadyExistsExceptionFaultFaultMessage;
import com.rusguard.schema.SaveAcsEmployeeRequest;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsAccessLevelSlimInfo;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    /**
     * Установка блокировки сотрудника
     */
    Map<String, Object> setEmployeeLocked(String IDEmployee, boolean flag);


    /**
     * Получение списка всех уровней точек доступа
    */
    List<AcsAccessLevelSlimInfo> getAccessLevelsSlim();
    /**
     * Получение списка сотрудников по ID группы
     */
    Map<String, Object> getEmployeesByGroupID(String params);

    /**
     * Получение списка сотрудников по Табельному номеру
     */
    Map<String, Object> GetEmployeesByTabelNumber(String params);
    
    /**
     * Получение информации о сотруднике по ФИО
     */
    Map<String, Object> getEmployeeByFIO(Map<String, String> params);
    
    /**
     * Получение информации о сотруднике по ID
     */
    Map<String, Object> getEmployeeById(String params);
    
    /**
     * Получение проходов сотрудника по дате
     */
    Map<String, Object> getEmployeePassagesByDate(String IDEmployee, String dataPassages);

    Map<String, Object> addEmailEmployee(String idEmployee, String email, String description) throws ILNetworkConfigurationServiceAddEmailAddressDataAlreadyExistsExceptionFaultFaultMessage;

    Map<String, Object>  addEmployee(String firstname, String lastname, String secondname, Integer tabelNumber, String position, String positionGroup, String comment, String adressReg, String passportIISUE, String passportNumber, String email, String emailDescription) throws ILNetworkConfigurationServiceAddEmailAddressDataAlreadyExistsExceptionFaultFaultMessage;
    Map<String, Object> saveAcsEmployee(String idEmployee, SaveAcsEmployeeRequest request);

    ResponseEntity<Map<String, Object>> GetEmployeeGroup();

    Map<String, Object> lockAcsEmployee(String idEmployee, boolean isLocked);

    Map<String, Object> setUseEmployeeParentAccessLevel(String employeeID, ArrayOfguid accessLevelIDs, boolean isUseParentAccessLevel);
}