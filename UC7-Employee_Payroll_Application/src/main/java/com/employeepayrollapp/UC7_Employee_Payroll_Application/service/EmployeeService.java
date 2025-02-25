package com.employeepayrollapp.UC7_Employee_Payroll_Application.service;

import com.employeepayrollapp.UC7_Employee_Payroll_Application.dto.EmployeeDTO;
import com.employeepayrollapp.UC7_Employee_Payroll_Application.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j  // Lombok annotation for logging
@Service
public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();
    private int idCounter = 1;

    public Employee addEmployee(EmployeeDTO employeeDTO) {
        log.info("Creating Employee object from DTO: {}", employeeDTO);
        Employee employee = new Employee(idCounter++, employeeDTO.getName(), employeeDTO.getSalary());
        employeeList.add(employee);
        log.info("Employee stored in memory: {}", employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        log.info("Returning list of all employees...");
        return employeeList;
    }
}

