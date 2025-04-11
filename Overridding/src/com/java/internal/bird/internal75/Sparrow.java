package com.java.internal.bird.internal75;

public class Sparrow extends Bird {
    @Override
    public void Fly() {
        System.out.println("running fly");
    }

    public void Chirp() {
        System.out.println("running chirp in sparrow");
        super.Fly();
    }
}
