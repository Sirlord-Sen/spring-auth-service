package com.example.springauthservice.exceptions.custom;

public class InvalidDataException extends RuntimeException{

    public InvalidDataException(String message){
        super(message);
    }
    
}
