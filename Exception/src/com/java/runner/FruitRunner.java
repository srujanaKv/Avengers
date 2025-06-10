package com.java.runner;

import com.java.exception.healthIssue;
import com.java.exceptions.Fruit;

public class FruitRunner {
    public static void main(String args[]){

        Boolean isFruitFresh=false;

        if(isFruitFresh){
            System.out.println("fruit is fresh");
        }
        else{
            throw new Fruit("not fresh");
        }
    }
}
