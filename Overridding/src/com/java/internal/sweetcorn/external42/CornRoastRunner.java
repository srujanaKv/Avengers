package com.java.internal.sweetcorn.external42;

import com.java.internal.sweetcorn.internal42.Sweetcorn;
import com.java.internal.sweetcorn.internal42.MasalaCorn;

public class CornRoastRunner {

    public void action(Sweetcorn corn) {
        if (corn != null) {
            corn.Roast();
            if (corn instanceof MasalaCorn) {
                MasalaCorn masala = (MasalaCorn) corn;
                masala.Spice();
            }
        } else {
            System.out.println("No corn to roast.");
        }
    }
}
