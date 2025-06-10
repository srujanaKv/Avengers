package com.java.exceptions;

public class Backlogs extends RuntimeException{
    public Backlogs(){
        super();
    }
    public Backlogs(String fail){
        super(fail);
    }
}
