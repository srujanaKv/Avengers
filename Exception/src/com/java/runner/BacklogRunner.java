package com.java.runner;

import com.java.exception.healthIssue;
import com.java.exceptions.Backlogs;

public class BacklogRunner {
    public static void main(String args[]){

        Boolean isBacklogsthere=false;

        if(isBacklogsthere){
            System.out.println("Is there backlog");
        }
        else{
            throw new Backlogs("not there");
        }
    }
}
