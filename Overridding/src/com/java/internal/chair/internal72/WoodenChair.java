package com.java.internal.chair.internal72;

public class WoodenChair extends Chair {
    @Override
    public void Sit() {
        System.out.println("running sit");
    }

    public void Support() {
        System.out.println("running support in wooden chair");
        super.Sit();
    }
}
