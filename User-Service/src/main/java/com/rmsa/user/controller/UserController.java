package com.rmsa.user.controller;

import com.rmsa.user.dto.UserDTO;
import com.rmsa.user.entity.User;
import com.rmsa.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.register(user));
    }
}
