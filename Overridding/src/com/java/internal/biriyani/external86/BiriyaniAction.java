package com.java.internal.biriyani.external86;

import com.java.internal.biriyani.internal86.Biriyani;
import com.java.internal.biriyani.internal86.ChickenBiriyani;

public class BiriyaniAction {

    public void performAction(Biriyani biriyani) {
        if (biriyani != null) {
            biriyani.Cook();
            if (biriyani instanceof ChickenBiriyani) {
                ChickenBiriyani chickenBiriyani = (ChickenBiriyani) biriyani;
                chickenBiriyani.Serve();
            } else {
                System.err.println("This is not a Chicken Biriyani");
            }
        } else {
            System.err.println("Biriyani is null");
        }
    }
}

