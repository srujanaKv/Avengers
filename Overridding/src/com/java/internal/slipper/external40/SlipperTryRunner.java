package com.java.internal.slipper.external40;

import com.java.internal.slipper.internal40.Slipper;
import com.java.internal.slipper.internal40.RubberSlipper;

public class SlipperTryRunner {

    public void action(Slipper slipper) {
        if (slipper != null) {
            slipper.Wear();
            if (slipper instanceof RubberSlipper) {
                RubberSlipper rubber = (RubberSlipper) slipper;
                rubber.Grip();
            }
        } else {
            System.out.println("No slipper to act upon.");
        }
    }
}
