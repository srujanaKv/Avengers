package com.java.internal.nailpolish.internal53;

public class GlitterPolish extends Nailpolish {
    @Override
    public void Coat() {
        System.out.println("running coat");
    }

    public void Shine() {
        System.out.println("running shine in glitter polish");
        super.Coat();
    }
}
