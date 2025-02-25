package com.employeepayrollapp.UC6_Employee_Payroll_Application.controller;

import com.employeepayrollapp.UC6_Employee_Payroll_Application.dto.EmployeeDTO;
import com.employeepayrollapp.UC6_Employee_Payroll_Application.model.Employee;
import com.employeepayrollapp.UC6_Employee_Payroll_Application.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for handling Employee Payroll API requests.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Adding Employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.addEmployee(employeeDTO);
    }

    // Fetching All Employees
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
