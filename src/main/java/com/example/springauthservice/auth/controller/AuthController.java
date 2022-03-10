package com.example.springauthservice.auth.controller;

import com.example.springauthservice.auth.service.AuthService;
import com.example.springauthservice.auth.service.TokenService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
	private ModelMapper modelMapper;

    @Autowired
    private AuthService authService;

    @Autowired
    private TokenService tokenService;

    @GetMapping("/")
    public String index(){
        return "Working";
    }


}
