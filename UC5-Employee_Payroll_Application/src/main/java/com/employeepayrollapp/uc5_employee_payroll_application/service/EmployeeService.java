package com.employeepayrollapp.uc5_employee_payroll_application.service;

import com.employeepayrollapp.uc5_employee_payroll_application.dto.EmployeeDTO;
import com.employeepayrollapp.uc5_employee_payroll_application.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDTO employeeDTO);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, EmployeeDTO employeeDTO);
    void deleteEmployee(Long id);
}

