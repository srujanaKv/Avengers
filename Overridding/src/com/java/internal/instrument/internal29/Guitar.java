package com.java.internal.instrument.internal29;

public class Guitar extends Instrument {
    @Override
    public void Play() {
        System.out.println("running play");
    }

    public void Tune() {
        System.out.println("running tune in guitar");
        super.Play();
    }
}