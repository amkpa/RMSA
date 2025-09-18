package com.rmsa.user.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String name;
    private String email;
    private String password;
    private String role = "USER";
}
