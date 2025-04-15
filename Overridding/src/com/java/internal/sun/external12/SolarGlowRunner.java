package com.java.internal.sun.external12;

import com.java.internal.sun.internal12.Sun;
import com.java.internal.sun.internal12.Light;

public class SolarGlowRunner {

    public void action(Sun sun) {
        if (sun != null) {
            sun.Shine();
            if (sun instanceof Light) {
                Light light = (Light) sun;
                light.Beam();
            }
        } else {
            System.out.println("No sun to act upon.");
        }
    }
}
