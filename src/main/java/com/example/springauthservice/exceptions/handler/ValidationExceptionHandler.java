package com.example.springauthservice.exceptions.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.springauthservice.exceptions.ErrorModel;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ValidationExceptionHandler extends ResponseEntityExceptionHandler{
    @Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
        MethodArgumentNotValidException ex, 
        HttpHeaders headers, 
        HttpStatus status, 
        WebRequest request
        ){
        
        Map<String, ArrayList<String>> errors = new HashMap<>();    
		ArrayList<String> messages = new ArrayList<String>();
		ex.getBindingResult().getAllErrors().forEach((error) ->{
			
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			messages.add(fieldName + " " + message);
		});
        errors.put("errors", messages);
		return new ResponseEntity<Object>(new ErrorModel(HttpStatus.BAD_REQUEST.value(), messages.get(1)), HttpStatus.BAD_REQUEST);
	}
}
