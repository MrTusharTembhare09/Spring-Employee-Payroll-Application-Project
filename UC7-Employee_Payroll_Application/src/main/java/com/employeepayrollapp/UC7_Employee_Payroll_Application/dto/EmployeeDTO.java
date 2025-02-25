package com.employeepayrollapp.UC7_Employee_Payroll_Application.dto;

import lombok.Data;

@Data  // Lombok annotation for getters, setters, toString, etc.
public class EmployeeDTO {
    private String name;
    private double salary;
}

