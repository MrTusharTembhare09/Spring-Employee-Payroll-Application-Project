package com.employeepayrollapp.uc4_employee_payroll_application.controller;

import com.employeepayrollapp.uc4_employee_payroll_application.dto.EmployeeDTO;
import com.employeepayrollapp.uc4_employee_payroll_application.model.Employee;
import com.employeepayrollapp.uc4_employee_payroll_application.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}

