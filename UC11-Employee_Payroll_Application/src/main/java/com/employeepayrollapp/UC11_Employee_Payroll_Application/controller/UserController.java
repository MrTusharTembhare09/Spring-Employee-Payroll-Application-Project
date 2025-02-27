package com.employeepayrollapp.UC11_Employee_Payroll_Application.controller;

import com.employeepayrollapp.UC11_Employee_Payroll_Application.dto.UserDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok("User created successfully!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok("User updated successfully!");
    }
}

