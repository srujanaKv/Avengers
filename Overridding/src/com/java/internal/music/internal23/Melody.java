package com.java.internal.music.internal23;

public class Melody extends Music {
    @Override
    public void Play() {
        System.out.println("running play");
    }

    public void Rhythm() {
        System.out.println("running rhythm in jazz");
        super.Play();
    }
}