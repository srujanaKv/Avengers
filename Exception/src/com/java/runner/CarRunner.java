package com.java.runner;

import com.java.exceptions.Car;
import com.java.exceptions.Trophy;

public class CarRunner {
    public static void main(String args[]){

        Boolean isCarwashed=true;

        if(isCarwashed){
            System.out.println("yes");
        }
        else{
            throw new Car("no");
        }
    }
}
