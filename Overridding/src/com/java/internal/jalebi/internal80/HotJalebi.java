package com.java.internal.jalebi.internal80;

public class HotJalebi extends Jalebi {
    @Override
    public void Swirl() {
        System.out.println("running swirl");
    }

    public void Dip() {
        System.out.println("running dip in hot jalebi");
        super.Swirl();
    }
}
