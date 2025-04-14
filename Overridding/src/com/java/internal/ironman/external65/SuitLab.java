package com.java.internal.ironman.external65;

import com.java.internal.ironman.internal65.Ironman;
import com.java.internal.ironman.internal65.Mark42;

public class SuitLab {

    public void testSuit(Ironman suit) {
        if (suit != null) {
            suit.Fly();
            if (suit instanceof Mark42) {
                Mark42 advancedSuit = (Mark42) suit;
                advancedSuit.Shoot();
            }
        } else {
            System.out.println("No suit available for testing.");
        }
    }
}