package com.java.exceptions;

public class MovieRelease extends RuntimeException{
    public MovieRelease(){
        super();
    }
    public MovieRelease(String message){
        super(message);
    }
}
