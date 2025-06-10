package com.java.exceptions;

public class Meat extends RuntimeException{
    public Meat(){
        super();
    }
    public Meat(String message){
        super(message);
    }
}
