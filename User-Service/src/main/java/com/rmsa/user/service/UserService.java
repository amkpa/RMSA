package com.rmsa.user.service;

import com.rmsa.user.dto.UserDTO;
import com.rmsa.user.entity.User;
import com.rmsa.user.repository.UserRepository;
import com.rmsa.user.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User register(UserDTO request) {
        if (Utils.isNull(request)) {
            throw new RuntimeException("Request Payload is Empty");
        }
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already registered");
        }
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("Username already registered");
        }
        User user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .name(request.getName())
                .password(request.getPassword())
                .role(request.getRole()).build();
        return userRepository.save(user);
    }
}
