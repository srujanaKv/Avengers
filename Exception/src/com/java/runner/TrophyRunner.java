package com.java.runner;

import com.java.exceptions.Taxpaid;
import com.java.exceptions.Trophy;

public class TrophyRunner {
    public static void main(String args[]){

        Boolean isTrophyWon=true;

        if(isTrophyWon){
            System.out.println("Won");
        }
        else{
            throw new Trophy("not yet");
        }
    }
}
