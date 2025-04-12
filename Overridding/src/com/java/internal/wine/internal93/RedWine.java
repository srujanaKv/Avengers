package com.java.internal.wine.internal93;

public class RedWine extends Wine {
    @Override
    public void Ferment() {
        System.out.println("running ferment");
    }

    public void Aged() {
        System.out.println("running aging in red wine");
        super.Ferment();
    }
}
