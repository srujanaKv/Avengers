package com.java.exceptions;

public class Fruit extends RuntimeException{
    public Fruit(){
        super();
    }
    public Fruit(String fresh){
        super(fresh);
    }
}
