package com.employeepayrollapp.UC9_Employee_Payroll_Application.repository;

import com.employeepayrollapp.UC9_Employee_Payroll_Application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

