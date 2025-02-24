package com.employeepayrollapp.uc1_employee_payroll_application.service;

import com.employeepayrollapp.uc1_employee_payroll_application.model.Employee;
import com.employeepayrollapp.uc1_employee_payroll_application.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service // Marking this as a service component
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // Fetching all employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Fetching a single employee by ID
    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    // Saving a new employee
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Updating an existing employee
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        if (repository.existsById(id)) {
            updatedEmployee.setId(id);
            return repository.save(updatedEmployee);
        }
        return null;
    }

    // Deleting an employee
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}

