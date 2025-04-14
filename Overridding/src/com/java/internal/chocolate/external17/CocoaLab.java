package com.java.internal.chocolate.external17;

import com.java.internal.chocolate.internal17.Chocolate;
import com.java.internal.chocolate.internal17.DarkChocolate;

public class CocoaLab {

    public void flavorAnalysis(Chocolate choco) {
        if (choco != null) {
            choco.Melt();
            if (choco instanceof DarkChocolate) {
                DarkChocolate intenseChoco = (DarkChocolate) choco;
                intenseChoco.Bitter();
            } else {
                System.err.println("This is not a DarkChocolate");
            }
        } else {
            System.err.println("Chocolate is null");
        }
    }
}
