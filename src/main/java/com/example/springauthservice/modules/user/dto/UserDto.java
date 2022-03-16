package com.example.springauthservice.modules.user.dto;

import java.io.Serializable;
import java.util.UUID;

import com.example.springauthservice.modules.user.entity.User;

public class UserDto implements Serializable {

    public UserDto(User user){
        if(user != null){
            this.id = user.getId();
            this.email = user.getEmail();
            this.username = user.getUsername();
            this.firstname = user.getFirstname();
            this.surname = user.getSurname();
        }
    }
    private UUID id;
    private String username;
    private String email;
    private String firstname;
    private String surname;

    public UUID getId() {
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getSurname(){
        return surname;
    }

}


