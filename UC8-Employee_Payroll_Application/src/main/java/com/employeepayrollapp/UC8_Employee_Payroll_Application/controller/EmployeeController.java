package com.employeepayrollapp.UC8_Employee_Payroll_Application.controller;

import com.employeepayrollapp.UC8_Employee_Payroll_Application.dto.EmployeeDTO;
import com.employeepayrollapp.UC8_Employee_Payroll_Application.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j  // Enables Logging
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public List<EmployeeDTO> getAllEmployees() {
        log.info("Received request to fetch all employees.");
        return employeeService.getAllEmployees();
    }

    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeDTO employee) {
        log.info("Received request to add employee: {}", employee);
        employeeService.addEmployee(employee);
        return "Employee added successfully!";
    }
}

