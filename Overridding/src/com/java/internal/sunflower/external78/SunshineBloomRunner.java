package com.java.internal.sunflower.external78;

import com.java.internal.sunflower.internal78.Sunflower;
import com.java.internal.sunflower.internal78.YellowSunflower;

public class SunshineBloomRunner {

    public void action(Sunflower sunflower) {
        if (sunflower != null) {
            sunflower.Bloom();
            if (sunflower instanceof YellowSunflower) {
                YellowSunflower yellow = (YellowSunflower) sunflower;
                yellow.Shine();
            }
        } else {
            System.out.println("No sunflower to act upon.");
        }
    }
}

