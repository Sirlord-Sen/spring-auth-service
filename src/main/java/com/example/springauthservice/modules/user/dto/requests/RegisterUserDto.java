package com.example.springauthservice.modules.user.dto.requests;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterUserDto implements Serializable{
    @NotEmpty
    private String username;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String password;

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String surname;

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getSurname(){
        return surname;
    }
}

