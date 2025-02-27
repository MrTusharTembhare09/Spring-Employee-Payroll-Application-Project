package com.employeepayrollapp.UC10_Employee_Payroll_Application.repository;

import com.employeepayrollapp.UC10_Employee_Payroll_Application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
