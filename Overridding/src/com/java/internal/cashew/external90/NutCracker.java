package com.java.internal.cashew.external90;

import com.java.internal.cashew.internal90.Cashew;
import com.java.internal.cashew.internal90.SaltedCashew;

public class NutCracker {

    public void flavorTest(Cashew nut) {
        if (nut != null) {
            nut.Crunch();
            if (nut instanceof SaltedCashew) {
                SaltedCashew flavored = (SaltedCashew) nut;
                flavored.Salt();
            } else {
                System.err.println("This is not a SaltedCashew");
            }
        } else {
            System.err.println("Cashew is null");
        }
    }
}
