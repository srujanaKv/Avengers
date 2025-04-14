package com.java.internal.city.external27;

import com.java.internal.city.internal27.City;
import com.java.internal.city.internal27.Banglore;

public class UrbanGrowth {

    public void cityProgress(City metropolis) {
        if (metropolis != null) {
            metropolis.Develop();
            if (metropolis instanceof Banglore) {
                Banglore bnglr = (Banglore) metropolis;
                bnglr.Skyscrapers();
            } else {
                System.err.println("This is not a Banglore city");
            }
        } else {
            System.err.println("City object is null");
        }
    }
}
