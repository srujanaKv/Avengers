package com.java.internal.halwa.external84;

import com.java.internal.halwa.internal84.Halwa;
import com.java.internal.halwa.internal84.CarrotHalwa;

public class DessertCorner {

    public void serve(Halwa sweet) {
        if (sweet != null) {
            sweet.Mix();
            if (sweet instanceof CarrotHalwa) {
                CarrotHalwa carrot = (CarrotHalwa) sweet;
                carrot.Steam();
            }
        } else {
            System.out.println("No dessert to serve.");
        }
    }
}
