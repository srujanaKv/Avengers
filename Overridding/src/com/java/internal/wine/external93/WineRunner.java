package com.java.internal.wine.external93;

import com.java.internal.wine.internal93.Wine;
import com.java.internal.wine.internal93.RedWine;

public class WineRunner {

    public void action(Wine wine) {
        if (wine != null) {
            wine.Ferment();
            if (wine instanceof RedWine) {
                RedWine redWine = (RedWine) wine;
                redWine.Aged();
            }
        } else {
            System.out.println("No wine to act upon.");
        }
    }
}

