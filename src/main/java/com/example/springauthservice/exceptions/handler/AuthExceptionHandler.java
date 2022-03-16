package com.example.springauthservice.exceptions.handler;

import com.example.springauthservice.exceptions.ErrorModel;
import com.example.springauthservice.exceptions.custom.ConflictException;
import com.example.springauthservice.exceptions.custom.InvalidDataException;
import com.example.springauthservice.exceptions.custom.NotFoundException;
import com.example.springauthservice.exceptions.custom.UnauthorizedException;

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

    @ExceptionHandler
    public ResponseEntity<ErrorModel> handlerException(NotFoundException exception){
        return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.NOT_FOUND.value(), exception.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorModel> handlerException(UnauthorizedException exception){
        return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.UNAUTHORIZED.value(), exception.getMessage()), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorModel> handlerException(ConflictException exception){
        return new ResponseEntity<ErrorModel>(new ErrorModel(HttpStatus.CONFLICT.value(), exception.getMessage()), HttpStatus.CONFLICT);
    }
    
}
