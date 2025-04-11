package com.java.internal.sun.internal12;

public class Light extends Sun {
    @Override
    public void Shine() {
        System.out.println("running shine");
    }

    public void Beam() {
        System.out.println("running beam in light");
        super.Shine();
    }
}