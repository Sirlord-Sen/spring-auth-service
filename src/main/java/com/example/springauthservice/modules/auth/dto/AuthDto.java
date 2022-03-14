package com.example.springauthservice.modules.auth.dto;

public class AuthDto {
    public class LoginDto{
        private String email;
        private String password;

        public String getEmail(){
            return email;
        }

        public String getPassword(){
            return password;
        }
    }
}
