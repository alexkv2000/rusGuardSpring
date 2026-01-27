package com.rusguard.service;

import java.time.LocalDate;
import java.util.Map;

public interface EmployeeService {
    
    /**
     * Установка блокировки сотрудника
     */
    Map<String, Object> setEmployeeLocked(String IDEmployee, boolean flag);
    
    /**
     * Получение списка сотрудников по ID группы
     */
    Map<String, Object> getEmployeesByGroupID(String params);
    
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
}