package com.java.exceptions;

public class Trophy extends RuntimeException{
    public Trophy(){
        super();
    }
    public Trophy(String message){
        super(message);
    }
}
