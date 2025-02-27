package com.employeepayrollapp.UC10_Employee_Payroll_Application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @NotBlank(message = "Name is required and cannot be empty")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name can only contain letters and spaces")
    private String name;
}

