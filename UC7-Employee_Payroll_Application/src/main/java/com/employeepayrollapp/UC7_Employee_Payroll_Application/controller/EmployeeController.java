package com.employeepayrollapp.UC7_Employee_Payroll_Application.controller;

import com.employeepayrollapp.UC7_Employee_Payroll_Application.dto.EmployeeDTO;
import com.employeepayrollapp.UC7_Employee_Payroll_Application.model.Employee;
import com.employeepayrollapp.UC7_Employee_Payroll_Application.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j  // Lombok annotation to enable logging
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        log.info("Received request to add an employee: {}", employeeDTO);
        Employee employee = employeeService.addEmployee(employeeDTO);
        log.info("Employee added successfully: {}", employee);
        return employee;
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        log.info("Fetching all employees...");
        List<Employee> employees = employeeService.getAllEmployees();
        log.info("Total employees fetched: {}", employees.size());
        return employees;
    }
}

