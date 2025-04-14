package com.java.internal.badam.external89;

import com.java.internal.badam.internal89.Badam;
import com.java.internal.badam.internal89.RoastedBadam;

public class BadamProcessor {

    public void process(Badam badam) {
        if (badam != null) {
            badam.Crunch();

            if (badam instanceof RoastedBadam) {
                RoastedBadam roasted = (RoastedBadam) badam;
                roasted.Roast();
            } else {
                System.err.println("This is not a roasted badam");
            }
        } else {
            System.err.println("Badam is null");
        }
    }
}
