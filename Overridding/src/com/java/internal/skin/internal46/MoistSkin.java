package com.java.internal.skin.internal46;

public class MoistSkin extends Skin {
    @Override
    public void Glow() {
        System.out.println("running glow");
    }

    public void Hydrate() {
        System.out.println("running hydrate in moist skin");
        super.Glow();
    }
}
