package com.example.springauthservice.exceptions.handler;

import com.example.springauthservice.exceptions.ErrorModel;
import com.example.springauthservice.exceptions.custom.InvalidDataException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AuthExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorModel> handlerException(InvalidDataException exception){
        return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.BAD_REQUEST.value(), exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
    
}
