package com.java.exceptions;

public class Car extends RuntimeException{
    public Car(){
        super();
    }
    public Car(String message){
        super(message);
    }

}
