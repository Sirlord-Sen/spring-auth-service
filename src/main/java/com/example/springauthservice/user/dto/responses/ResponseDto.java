package com.example.springauthservice.user.dto.responses;

import java.io.Serializable;

import com.example.springauthservice.user.dto.UserDto;
import com.example.springauthservice.user.entity.User;

public class ResponseDto implements Serializable{
    
    public ResponseDto(User user){
        this.user = new UserDto(user);
    }

    private UserDto user;

    public UserDto getUser(){
        return user;
    }
}
