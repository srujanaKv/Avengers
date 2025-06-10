package com.java.exceptions;

public class Tv extends RuntimeException{
    public Tv(){
        super();
    }
    public Tv(String message){
        super(message);
    }
}
