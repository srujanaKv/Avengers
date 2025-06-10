package com.java.exceptions;

public class Taxpaid extends RuntimeException{
    public Taxpaid(){
        super();
    }
    public Taxpaid(String message){
        super(message);
    }

}
