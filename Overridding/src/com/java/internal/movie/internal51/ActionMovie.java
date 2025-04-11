package com.java.internal.movie.internal51;

public class ActionMovie extends Movie {
    @Override
    public void Play() {
        System.out.println("running play");
    }

    public void Stunt() {
        System.out.println("running stunt in action movie");
        super.Play();
    }
}
