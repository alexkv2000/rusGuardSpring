package com.rusguard.controller;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.rusguard.client.ILNetworkConfigurationService;
import com.rusguard.client.ILNetworkConfigurationServiceLockAcsEmployeeArgumentExceptionFaultFaultMessage;
import com.rusguard.client.ILNetworkConfigurationServiceLockAcsEmployeeDataNotFoundExceptionFaultFaultMessage;
import com.rusguard.client.LockAcsEmployee;
import com.rusguard.service.EmployeeService;
import com.rusguard.service.impl.EmployeeServiceImpl;
import jakarta.xml.bind.JAXBElement;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsAccessLevelSlimInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping("/api/rusguard/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    private ILNetworkConfigurationService networkCnfgService;

    @GetMapping("/getAccessLevels")
    public ResponseEntity<List<Map<String, Object>>> getAccessLevelsSlim() {
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

    @GetMapping("/getByFIO")
    public ResponseEntity<Map<String, Object>> getByFIO(
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String secondName,
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

    @GetMapping("/getById")
    public ResponseEntity<Map<String, Object>> getById(
            @RequestParam(required = false) String idEmployee) {
        Map<String, Object> result = employeeService.getEmployeeById(idEmployee.toUpperCase());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByGroupID")
    public ResponseEntity<Map<String, Object>> getByGroupID(@RequestParam(required = false) String idGroup) {
        Map<String, Object> result = employeeService.getEmployeesByGroupID(idGroup.toUpperCase());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByTabelNumber")
    public ResponseEntity<Map<String, Object>> getByTabelNumber(@RequestParam(required = false) String tabelNumber) {
        Map<String, Object> result = employeeService.GetEmployeesByTabelNumber(tabelNumber);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getPassagesByDate")
    public ResponseEntity<Map<String, Object>> getPassagesByDate(
            @RequestParam(required = false) String idEmployee,
            @RequestParam(required = false) String dataPassages) {
        Map<String, Object> result = employeeService.getEmployeePassagesByDate(idEmployee.toUpperCase(), dataPassages);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/setLocked")
    public ResponseEntity<Map<String, Object>> setLocked(@RequestParam String idEmployee, @RequestParam boolean flag) {
        try {
            employeeService.setEmployeeLocked(idEmployee, flag);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/addEmail")
    public ResponseEntity<Map<String, Object>> addEmail(@RequestParam(required = false) String idEmployee, @RequestParam(required = false) String email, @RequestParam(required = false) String description) {
        try {
            employeeService.addEmailEmployee(idEmployee, email, description);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

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

}