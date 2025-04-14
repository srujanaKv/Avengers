package com.java.internal.flower.external15;

import com.java.internal.flower.internal15.Flower;
import com.java.internal.flower.internal15.Rose;

public class GardenExplorer {

    public void explore(Flower f) {
        f.Bloom();
        if (f instanceof Rose) {
            Rose r = (Rose) f;
            r.Smell();
        } else {
            System.out.println("This flower is not a rose.");
        }
    }

}