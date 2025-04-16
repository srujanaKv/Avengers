package com.java.internal.temple.external100;

import com.java.internal.temple.internal100.Temple;
import com.java.internal.temple.internal100.GoldenTemple;

public class Templevisit {

    public void action(Temple temple) {
        if (temple != null) {
            temple.Worship();
            if (temple instanceof GoldenTemple) {
                GoldenTemple gt = (GoldenTemple) temple;
                gt.Shine();
            }
        } else {
            System.out.println("No temple to visit.");
        }
    }
}


