package com.java.internal.instrument.external29;

import com.java.internal.instrument.internal29.Instrument;
import com.java.internal.instrument.internal29.Guitar;

public class SoundStudio {

    public void showcase(Instrument instrument) {
        if (instrument != null) {
            instrument.Play();
            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar) instrument;
                guitar.Tune();
            }
        } else {
            System.out.println("No instrument to showcase.");
        }
    }
}