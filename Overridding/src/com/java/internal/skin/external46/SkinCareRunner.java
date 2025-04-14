package com.java.internal.skin.external46;

import com.java.internal.skin.internal46.Skin;
import com.java.internal.skin.internal46.MoistSkin;

public class SkinCareRunner {

    public void action(Skin skin) {
        if (skin != null) {
            skin.Glow();
            if (skin instanceof MoistSkin) {
                MoistSkin moist = (MoistSkin) skin;
                moist.Hydrate();
            }
        } else {
            System.out.println("No skin to act upon.");
        }
    }
}
