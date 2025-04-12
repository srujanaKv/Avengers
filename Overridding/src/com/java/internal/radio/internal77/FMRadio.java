package com.java.internal.radio.internal77;

public class FMRadio extends Radio {
    @Override
    public void Play() {
        System.out.println("running play");
    }

    public void Tune() {
        System.out.println("running tune in fm radio");
        super.Play();
    }
}
