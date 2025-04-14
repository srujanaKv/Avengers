package com.java.internal.oven.external37;

import com.java.internal.oven.internal37.Oven;
import com.java.internal.oven.internal37.Microwave;

public class OvenRunner {

    public void startBaking(Oven oven) {
        if (oven != null) {
            oven.Bake();
            if (oven instanceof Microwave) {
                Microwave microwave = (Microwave) oven;
                microwave.Heat();
            }
        } else {
            System.out.println("No oven to bake.");
        }
    }
}