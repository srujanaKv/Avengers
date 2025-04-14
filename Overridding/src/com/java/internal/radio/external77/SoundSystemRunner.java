package com.java.internal.radio.external77;

import com.java.internal.radio.internal77.Radio;
import com.java.internal.radio.internal77.FMRadio;

public class SoundSystemRunner {

    public void broadcast(Radio radio) {
        if (radio != null) {
            radio.Play();
            if (radio instanceof FMRadio) {
                FMRadio fm = (FMRadio) radio;
                fm.Tune();
            }
        } else {
            System.out.println("No radio to play.");
        }
    }
}
