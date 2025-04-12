package com.java.internal.sunflower.internal78;

public class YellowSunflower extends Sunflower {
    @Override
    public void Bloom() {
        System.out.println("running bloom");
    }

    public void Shine() {
        System.out.println("running shine in yellow sunflower");
        super.Bloom();
    }
}
