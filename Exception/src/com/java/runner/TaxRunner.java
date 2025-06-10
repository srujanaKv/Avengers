package com.java.runner;

import com.java.exceptions.MovieRelease;
import com.java.exceptions.Taxpaid;

public class TaxRunner {
    public static void main(String args[]){

        Boolean isTaxPiad=true;

        if(isTaxPiad){
            System.out.println("Paid");
        }
        else{
            throw new Taxpaid("not paid");
        }
    }
}
