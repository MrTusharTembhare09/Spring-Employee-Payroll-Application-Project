package com.employeepayrollapp.UC7_Employee_Payroll_Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor  // Lombok annotations to auto-generate constructor
public class Employee {
    private int id;
    private String name;
    private double salary;
}

