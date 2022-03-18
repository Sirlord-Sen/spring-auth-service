package com.example.springauthservice.modules.auth.service;

import com.example.springauthservice.providers.jwt.JwtService;
// import com.example.springauthservice.modules.auth.repository.RefreshTokenRepository;
import com.example.springauthservice.modules.user.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {
    // @Autowired
    // private RefreshTokenRepository refreshTokenRepository;

    @Autowired
    private JwtService jwtService;

    public String generatedAccessToken(User user){
        return jwtService.generateToken(user);
    }
}
