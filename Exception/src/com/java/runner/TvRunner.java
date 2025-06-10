package com.java.runner;

import com.java.exceptions.Mobile;
import com.java.exceptions.Tv;

public class TvRunner {
    public static void main(String args[]){

        Boolean isTvWorking=true;

        if( isTvWorking){
            System.out.println("yes");
        }
        else{
            throw new Tv("no");
        }
    }
}
