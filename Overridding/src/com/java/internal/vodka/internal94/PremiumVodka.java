package com.java.internal.vodka.internal94;

public class PremiumVodka extends Vodka {
    @Override
    public void Distill() {
        System.out.println("running distill");
    }

    public void Purify() {
        System.out.println("running purify in premium vodka");
        super.Distill();
    }
}