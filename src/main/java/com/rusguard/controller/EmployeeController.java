package com.rusguard.controller;

import com.rusguard.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/rusguard/Employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getByFIO")
    public ResponseEntity<Map<String, Object>> getByFIO(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String secondName) {

        // Create a params map from the method parameters
        Map<String, String> params = new HashMap<>();
        if (firstName != null) params.put("firstName", firstName);
        if (lastName != null) params.put("lastName", lastName);
        if (secondName != null) params.put("secondName", secondName);

        // Call the service method with the parameters
        Map<String, Object> result = employeeService.getEmployeeByFIO(params);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getById")
    public ResponseEntity<Map<String, Object>> getById(@RequestParam Map<String, String> IDEmployee) {
        // Вызов метода getEmployee с переданными параметрами
        Map<String, Object> result = employeeService.getEmployeeById(IDEmployee);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getByGroupID")
    public ResponseEntity<Map<String, Object>> getByGroupID(@RequestParam Map<String, String> params) {
        // Вызов метода getEmployeesByGroupID с переданными параметрами
        Map<String, Object> result = employeeService.getEmployeesByGroupID(params);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getPassagesByDate")
    public ResponseEntity<Map<String, Object>> getPassagesByDate(@RequestParam Map<String, String> params) {
        // Вызов метода getEmployeePassagesByDate с переданными параметрами
        Map<String, Object> result = employeeService.getEmployeePassagesByDate(params);
        return ResponseEntity.ok(result);
    }
//    @PostMapping("/setLocked")
//    public ResponseEntity<Map<String, Object>> setLocked(@RequestBody Map<String, Object> requestData) {
//        // Вызов метода setEmployeeLocked с переданными параметрами
//        Map<String, Object> result = employeeService.setEmployeeLocked(requestData);
//        return ResponseEntity.ok(result);
//    }
}