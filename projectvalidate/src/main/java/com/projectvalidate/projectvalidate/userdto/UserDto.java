package com.projectvalidate.projectvalidate.userdto;

import lombok.Data;

@Data
public class UserDto
{
    private String username;
    private String password;
    private String email;
    private String role;
}

