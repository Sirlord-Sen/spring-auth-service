package com.example.springauthservice.user.dto.responses;

import com.example.springauthservice.user.entity.User;

public class UserResponseDto {

    public UserResponseDto(User user, String message){
        this.message = message;
        this.data = new ResponseDto(user);
    }

    private String message;
    private Object data;

    public String getMessage(){
        return message;
    }

    public Object getData(){
        return data;
    }
    
}
