package com.employeepayrollapp.UC6_Employee_Payroll_Application.service;

import com.employeepayrollapp.UC6_Employee_Payroll_Application.dto.EmployeeDTO;
import com.employeepayrollapp.UC6_Employee_Payroll_Application.model.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Service Layer for managing Employee Payroll.
 */
@Service
public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();
    private int idCounter = 1;

    // Adding employee to the list (simulating database storage)
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(idCounter++, employeeDTO.getName(), employeeDTO.getSalary());
        employeeList.add(employee);
        return employee;
    }

    // Fetching all employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}

