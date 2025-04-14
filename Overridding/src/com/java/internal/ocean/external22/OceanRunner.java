package com.java.internal.ocean.external22;

import com.java.internal.ocean.internal22.Ocean;
import com.java.internal.ocean.internal22.Pacific;

public class OceanRunner {

    public void startOceanWave(Ocean ocean) {
        if (ocean != null) {
            ocean.Wave();
            if (ocean instanceof Pacific) {
                Pacific pacific = (Pacific) ocean;
                pacific.Deep();
            }
        } else {
            System.out.println("No ocean to wave.");
        }
    }
}
