package com.java.internal.mountain.internal24;

public class Everest extends Mountain {
    @Override
    public void Climb() {
        System.out.println("running climb");
    }

    public void Height() {
        System.out.println("running height in everest");
        super.Climb();
    }
}
