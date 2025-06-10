package com.java.runner;

import com.java.exceptions.Meat;
import com.java.exceptions.Tv;

public class MeatRunner {
    public static void main(String args[]){

        Boolean isMeatFresh=true;

        if( isMeatFresh){
            System.out.println("yes");
        }
        else{
            throw new Meat("no");
        }
    }
}
