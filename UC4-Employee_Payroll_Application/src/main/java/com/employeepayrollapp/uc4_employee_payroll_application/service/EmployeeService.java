package com.employeepayrollapp.uc4_employee_payroll_application.service;

import com.employeepayrollapp.uc4_employee_payroll_application.dto.EmployeeDTO;
import com.employeepayrollapp.uc4_employee_payroll_application.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDTO employeeDTO);
    List<Employee> getAllEmployees();
}

