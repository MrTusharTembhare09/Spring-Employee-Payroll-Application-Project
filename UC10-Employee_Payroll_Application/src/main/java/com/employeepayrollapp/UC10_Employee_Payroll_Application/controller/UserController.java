package com.employeepayrollapp.UC10_Employee_Payroll_Application.controller;

import com.employeepayrollapp.UC10_Employee_Payroll_Application.dto.UserDTO;
import com.employeepayrollapp.UC10_Employee_Payroll_Application.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.updateUser(id, userDTO));
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}

