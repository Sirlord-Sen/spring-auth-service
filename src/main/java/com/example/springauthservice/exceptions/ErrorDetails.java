package com.example.springauthservice.exceptions;

import java.io.Serializable;

import lombok.Data;

@Data
public class ErrorDetails implements Serializable{
    
    private final String message;

    private final long timestamp;

    public ErrorDetails(final String message){
        this.timestamp = System.currentTimeMillis();
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public long getTimestamp(){
        return timestamp;
    }
}
