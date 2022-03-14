package com.example.springauthservice.modules.auth.controller;

import com.example.springauthservice.modules.auth.dto.AuthDto.LoginDto;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    // @Autowired
    // private AuthService authService;

    // @Autowired
    // private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto body){
        return ResponseEntity.ok("Working");
    }


}
