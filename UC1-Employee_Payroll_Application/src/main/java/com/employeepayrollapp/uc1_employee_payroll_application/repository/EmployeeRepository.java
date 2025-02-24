package com.employeepayrollapp.uc1_employee_payroll_application.repository;

import com.employeepayrollapp.uc1_employee_payroll_application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marking this as a repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

