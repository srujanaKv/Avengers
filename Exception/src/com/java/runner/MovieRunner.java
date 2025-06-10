package com.java.runner;

import com.java.exceptions.Backlogs;
import com.java.exceptions.MovieRelease;

public class MovieRunner {
    public static void main(String args[]){

        Boolean isMovieReleased=true;

        if(isMovieReleased){
            System.out.println("Released");
        }
        else{
            throw new MovieRelease("not yet");
        }
    }
}
