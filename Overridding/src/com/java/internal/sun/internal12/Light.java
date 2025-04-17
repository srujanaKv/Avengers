package com.java.internal.sun.internal12;

public class Light extends Sun {
    public Light(){
        super("orange",60000);
        System.out.println("running inside the light constructor");
    }
    @Override
    public void Shine() {
        System.out.println("running shine");
    }

    public void Beam() {
        System.out.println("running beam in light");
        super.Shine();
    }
}