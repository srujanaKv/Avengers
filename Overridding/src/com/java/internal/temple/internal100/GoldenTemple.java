package com.java.internal.temple.internal100;

public class GoldenTemple extends Temple {
    @Override
    public void Worship() {
        System.out.println("running worship");
    }

    public void Shine() {
        System.out.println("running shine in golden temple");
        super.Worship();
    }
}