package com.java.exception;

public class HealthRunner {
    public static void main(String args[]){

        Boolean ishealthokay=true;

        if(ishealthokay){
            System.out.println("health is okay");
        }
        else{
            throw new healthIssue("not good");
        }
    }
}
