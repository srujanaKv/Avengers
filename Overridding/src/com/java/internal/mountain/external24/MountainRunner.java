package com.java.internal.mountain.external24;

import com.java.internal.mountain.internal24.Mountain;
import com.java.internal.mountain.internal24.Everest;

public class MountainRunner {

    public void explore(Mountain mountain) {
        if (mountain != null) {
            mountain.Climb();
            if (mountain instanceof Everest) {
                Everest everest = (Everest) mountain;
                everest.Height();
            }
        } else {
            System.out.println("No mountain provided.");
        }
    }
}
