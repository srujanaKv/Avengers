package com.java.exceptions;

public class Mobile extends RuntimeException{
    public Mobile(){
        super();
    }
    public Mobile(String message){
        super(message);
    }
}
