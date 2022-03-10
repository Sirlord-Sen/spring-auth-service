package com.example.springauthservice.auth.repository;

import java.util.UUID;

import com.example.springauthservice.auth.entity.RefreshToken;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, UUID>{
    
}
