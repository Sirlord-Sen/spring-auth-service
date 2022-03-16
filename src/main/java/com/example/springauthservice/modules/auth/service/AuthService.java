package com.example.springauthservice.modules.auth.service;

import com.example.springauthservice.exceptions.custom.UnauthorizedException;
import com.example.springauthservice.modules.auth.dto.requests.LoginDto;
import com.example.springauthservice.modules.user.entity.User;
import com.example.springauthservice.modules.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;
    
    public User login(LoginDto body){
        User user = userService.getUserByEmail(body.getEmail());
        Boolean validatePassword = userService.validatePassword(user.getPassword(), body.getPassword());
        if(!validatePassword) throw new UnauthorizedException("Invalid Login Credentials");
        return user;
    }
    
}
