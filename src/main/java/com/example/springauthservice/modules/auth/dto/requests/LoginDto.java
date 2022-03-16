package com.example.springauthservice.modules.auth.dto.requests;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginDto {
    @NotEmpty
    @NotNull
    private String email;

    @NotEmpty
    @NotNull
    private String password;

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }
    
}
