package com.employeepayrollapp.UC8_Employee_Payroll_Application.service;

import com.employeepayrollapp.UC8_Employee_Payroll_Application.dto.EmployeeDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j  // Enables Logging
@Service
public class EmployeeService {
    private final List<EmployeeDTO> employeeList = new ArrayList<>();

    public List<EmployeeDTO> getAllEmployees() {
        log.info("Fetching all employees...");
        return employeeList;
    }

    public void addEmployee(EmployeeDTO employee) {
        if (employee.getName() == null || employee.getName().isEmpty()) {
            log.error("Error: Employee name is missing!");
            throw new IllegalArgumentException("Employee name is required.");
        }
        log.debug("Adding employee: {}", employee);
        employeeList.add(employee);
    }
}

