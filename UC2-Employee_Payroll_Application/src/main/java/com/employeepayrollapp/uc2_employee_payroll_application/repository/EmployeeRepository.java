package com.employeepayrollapp.uc2_employee_payroll_application.repository;

import com.employeepayrollapp.uc2_employee_payroll_application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

