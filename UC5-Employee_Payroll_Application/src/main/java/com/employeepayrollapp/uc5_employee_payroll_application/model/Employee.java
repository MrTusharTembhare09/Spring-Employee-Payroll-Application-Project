package com.employeepayrollapp.uc5_employee_payroll_application.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private double salary;
}

