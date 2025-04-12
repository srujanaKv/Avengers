package com.java.internal.badam.internal89;

public class RoastedBadam extends Badam {
    @Override
    public void Crunch() {
        System.out.println("running crunch");
    }

    public void Roast() {
        System.out.println("running roast in roasted badam");
        super.Crunch();
    }
}
