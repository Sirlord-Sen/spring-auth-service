package com.example.springauthservice.modules.user.controller;

import javax.validation.Valid;

import com.example.springauthservice.modules.user.dto.UserDto;
import com.example.springauthservice.modules.user.dto.requests.RegisterUserDto;
import com.example.springauthservice.modules.user.entity.User;
import com.example.springauthservice.modules.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserContoller {
    
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> signup(@Valid @RequestBody RegisterUserDto body){
        User user = this.userService.signup(body);
        UserDto response = new UserDto(user);
        return new ResponseEntity<UserDto>(response, null, HttpStatus.CREATED);
    }

}
