package com.java.internal.stove.external38;

import com.java.internal.stove.internal38.Stove;
import com.java.internal.stove.internal38.GasStove;

public class FlameControlRunner {

    public void action(Stove stove) {
        if (stove != null) {
            stove.Burn();
            if (stove instanceof GasStove) {
                GasStove gasStove = (GasStove) stove;
                gasStove.Ignite();
            }
        } else {
            System.out.println("No stove to act upon.");
        }
    }

}

