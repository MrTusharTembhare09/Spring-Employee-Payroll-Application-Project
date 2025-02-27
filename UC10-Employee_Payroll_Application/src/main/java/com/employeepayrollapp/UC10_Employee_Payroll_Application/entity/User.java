package com.employeepayrollapp.UC10_Employee_Payroll_Application.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required and cannot be empty")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name can only contain letters and spaces")
    @Column(nullable = false)
    private String name;
}
