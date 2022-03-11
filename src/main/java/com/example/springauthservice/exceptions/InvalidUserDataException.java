package com.example.springauthservice.exceptions;

public class InvalidUserDataException extends RuntimeException{

    public InvalidUserDataException(String message){
        super(message);
    }
    
}
