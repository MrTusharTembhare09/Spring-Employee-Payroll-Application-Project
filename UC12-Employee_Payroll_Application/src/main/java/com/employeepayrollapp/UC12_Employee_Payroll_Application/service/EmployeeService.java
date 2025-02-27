package com.employeepayrollapp.UC12_Employee_Payroll_Application.service;

import com.employeepayrollapp.UC12_Employee_Payroll_Application.exception.EmployeeNotFoundException;
import com.employeepayrollapp.UC12_Employee_Payroll_Application.model.Employee;
import com.employeepayrollapp.UC12_Employee_Payroll_Application.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

