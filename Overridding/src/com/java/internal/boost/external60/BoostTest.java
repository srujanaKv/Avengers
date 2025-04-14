package com.java.internal.boost.external60;

import com.java.internal.boost.internal60.Boost;
import com.java.internal.boost.internal60.EnergyBoost;

public class BoostTest {

    public void testBoost(Boost boost) {
        if (boost != null) {
            boost.Drink();
            if (boost instanceof EnergyBoost) {
                EnergyBoost energyBoost = (EnergyBoost) boost;
                energyBoost.Energize();
            } else {
                System.err.println("This is not an EnergyBoost");
            }
        } else {
            System.err.println("Boost is null");
        }
    }
}
