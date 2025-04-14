package com.java.internal.egg.external30;

import com.java.internal.egg.internal30.Egg;
import com.java.internal.egg.internal30.ChickenEgg;

public class OmeletteMaker {

    public void crack(Egg e) {
        if (e != null) {
            e.Hatch();
            if (e instanceof ChickenEgg) {
                ChickenEgg ce = (ChickenEgg) e;
                ce.Shell();
            } else {
                System.out.println("Not a chicken egg.");
            }
        } else {
            System.out.println("Egg is null.");
        }
    }
}
