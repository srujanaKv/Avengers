package com.java.internal.lipstick.external47;

import com.java.internal.lipstick.internal47.Lipstick;
import com.java.internal.lipstick.internal47.Matte;

public class MakeupPouch {

    public void showLipstick(Lipstick lipstick) {
        if (lipstick != null) {
            lipstick.Apply();
            if (lipstick instanceof Matte) {
                Matte matte = (Matte) lipstick;
                matte.Shade();
            }
        } else {
            System.out.println("No lipstick to show.");
        }
    }
}
