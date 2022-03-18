package com.example.springauthservice.modules.auth.controller;

import javax.validation.Valid;

import com.example.springauthservice.modules.auth.dto.requests.LoginDto;
import com.example.springauthservice.modules.auth.service.AuthService;
import com.example.springauthservice.modules.auth.service.TokenService;
import com.example.springauthservice.modules.user.dto.UserDto;
import com.example.springauthservice.modules.user.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@Valid @RequestBody LoginDto body){
        User user = this.authService.login(body);
        String tokens = this.tokenService.generatedAccessToken(user);
        System.out.println(tokens);
        return new ResponseEntity<UserDto>(new UserDto(user), null, HttpStatus.ACCEPTED);
    }


}
