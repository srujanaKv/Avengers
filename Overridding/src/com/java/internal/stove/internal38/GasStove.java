package com.java.internal.stove.internal38;

public class GasStove extends Stove {
    @Override
    public void Burn() {
        System.out.println("running burn");
    }

    public void Ignite() {
        System.out.println("running ignite in gas stove");
        super.Burn();
    }
}
