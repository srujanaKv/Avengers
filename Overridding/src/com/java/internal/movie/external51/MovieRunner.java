package com.java.internal.movie.external51;

import com.java.internal.movie.internal51.Movie;
import com.java.internal.movie.internal51.ActionMovie;

public class MovieRunner {

    public void startMovie(Movie movie) {
        if (movie != null) {
            movie.Play();
            if (movie instanceof ActionMovie) {
                ActionMovie actionMovie = (ActionMovie) movie;
                actionMovie.Stunt();
            }
        } else {
            System.out.println("No movie to play.");
        }
    }
}
