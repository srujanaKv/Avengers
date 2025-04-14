package com.java.internal.stone.external21;

import com.java.internal.stone.internal21.Stone;
import com.java.internal.stone.internal21.Granite;

public class StoneSurfaceRunner {

    public void action(Stone stone) {
        if (stone != null) {
            stone.Weight();
            if (stone instanceof Granite) {
                Granite granite = (Granite) stone;
                granite.Texture();
            }
        } else {
            System.out.println("No stone to act upon.");
        }
    }
}
