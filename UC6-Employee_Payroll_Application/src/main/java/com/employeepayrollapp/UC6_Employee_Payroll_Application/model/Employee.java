package com.employeepayrollapp.UC6_Employee_Payroll_Application.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Model class representing Employee.
 */
@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

