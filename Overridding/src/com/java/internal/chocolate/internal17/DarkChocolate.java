package com.java.internal.chocolate.internal17;

public class DarkChocolate extends Chocolate {
    @Override
    public void Melt() {
        System.out.println("running melt");
    }

    public void Bitter() {
        System.out.println("running bitter in dark chocolate");
        super.Melt();
    }
}
