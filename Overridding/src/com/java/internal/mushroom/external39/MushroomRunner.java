package com.java.internal.mushroom.external39;

import com.java.internal.mushroom.internal39.Mushroom;
import com.java.internal.mushroom.internal39.ButtonMushroom;

public class MushroomRunner {

    public void startMushroomGrowth(Mushroom mushroom) {
        if (mushroom != null) {
            mushroom.Grow();
            if (mushroom instanceof ButtonMushroom) {
                ButtonMushroom buttonMushroom = (ButtonMushroom) mushroom;
                buttonMushroom.Cook();
            }
        } else {
            System.out.println("No mushroom to grow.");
        }
    }
}
