package com.employeepayrollapp.UC8_Employee_Payroll_Application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Generates Getters, Setters, toString, equals, and hashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private String name;
    private double salary;
}

