package com.java.internal.brinjal.external16;

import com.java.internal.brinjal.internal16.Brinjal;
import com.java.internal.brinjal.internal16.PurpleBrinjal;

public class BrinjalFusion {

    public void executeFusion(Brinjal vegetable) {
        if (vegetable != null) {
            vegetable.Cook();
            if (vegetable instanceof PurpleBrinjal) {
                PurpleBrinjal variety = (PurpleBrinjal) vegetable;
                variety.Taste();
            } else {
                System.err.println("This is not a PurpleBrinjal");
            }
        } else {
            System.err.println("Brinjal is null");
        }
    }
}
