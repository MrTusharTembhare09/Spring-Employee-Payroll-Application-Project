package com.employeepayrollapp.UC10_Employee_Payroll_Application.service;

import com.employeepayrollapp.UC10_Employee_Payroll_Application.dto.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(Long id, UserDTO userDTO);
    List<UserDTO> getAllUsers();
}

