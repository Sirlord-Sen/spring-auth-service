package com.example.springauthservice.exceptions;

import java.io.Serializable;

import lombok.Data;

@Data
public class ErrorModel implements Serializable{

    private int status;
    private String message;
    private long timestamp;

    public ErrorModel(int status, String message){
        this.status = status;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public long getTimestamp(){
        return timestamp;
    }

    public void setTimestamp(long timestamp){
        this.timestamp = timestamp;
    }
}
