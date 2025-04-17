package com.java.internal.vodka.external94;

import com.java.internal.vodka.internal94.Vodka;
import com.java.internal.vodka.internal94.PremiumVodka;

public class VodkaRunner {

    public void action(Vodka vodka) {
        if (vodka != null) {
            vodka.Distill();
            if (vodka instanceof PremiumVodka) {
                PremiumVodka premium = (PremiumVodka) vodka;
                premium.Purify();
            }
        } else {
            System.out.println("No vodka to act upon.");
        }
    }
}

