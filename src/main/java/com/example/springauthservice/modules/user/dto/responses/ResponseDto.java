package com.example.springauthservice.modules.user.dto.responses;

import java.io.Serializable;

import com.example.springauthservice.modules.user.dto.UserDto;
import com.example.springauthservice.modules.user.entity.User;

public class ResponseDto implements Serializable{
    
    public ResponseDto(User user){
        this.user = new UserDto(user);
    }

    private UserDto user;

    public UserDto getUser(){
        return user;
    }
}
