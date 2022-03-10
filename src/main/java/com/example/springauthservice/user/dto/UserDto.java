package com.example.springauthservice.user.dto;

public class UserDto {
    public class CreateUserDto{
        private String username;
        private String email;
        private String firstname;
        private String surname;
        private String password;

        public String getUsername(){
            return username;
        }

        public String getEmail(){
            return email;
        }

        public String getFirstname(){
            return firstname;
        }

        public String getSurname(){
            return surname;
        }

        public String getPassword(){
            return password;
        }
    }

    
}


