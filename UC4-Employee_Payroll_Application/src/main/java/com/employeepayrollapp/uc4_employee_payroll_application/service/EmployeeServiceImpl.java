package com.employeepayrollapp.uc4_employee_payroll_application.service;

import com.employeepayrollapp.uc4_employee_payroll_application.dto.EmployeeDTO;
import com.employeepayrollapp.uc4_employee_payroll_application.model.Employee;
import com.employeepayrollapp.uc4_employee_payroll_application.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}

