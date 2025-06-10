package com.java.runner;

import com.java.exceptions.Car;
import com.java.exceptions.Mobile;

public class MobileRunner {
    public static void main(String args[]){

        Boolean isMobileWorking=true;

        if(isMobileWorking){
            System.out.println("yes");
        }
        else{
            throw new Mobile("no");
        }
    }
}
