package com.employeepayrollapp.uc1_employee_payroll_application.model;

import jakarta.persistence.*;
import lombok.*;

@Entity  // Marking this as a database entity
@Data    // Lombok annotation to generate Getters, Setters, toString, etc.
@NoArgsConstructor  // Generates a no-argument constructor
@AllArgsConstructor // Generates an all-argument constructor
@Table(name = "employees")  // Assigning table name
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generating primary key
    private Long id;

    private String name;
    private String department;
    private double salary;
}

