package com.employeepayrollapp.UC10_Employee_Payroll_Application.service;

import com.employeepayrollapp.UC10_Employee_Payroll_Application.dto.UserDTO;
import com.employeepayrollapp.UC10_Employee_Payroll_Application.entity.User;
import com.employeepayrollapp.UC10_Employee_Payroll_Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user = userRepository.save(user);
        return new UserDTO(user.getId(), user.getName());
    }

    @Override
    public UserDTO updateUser(Long id, UserDTO userDTO) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDTO.getName());
        user = userRepository.save(user);
        return new UserDTO(user.getId(), user.getName());
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserDTO(user.getId(), user.getName()))
                .collect(Collectors.toList());
    }
}

