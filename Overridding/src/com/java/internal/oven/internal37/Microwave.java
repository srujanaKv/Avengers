package com.java.internal.oven.internal37;

public class Microwave extends Oven {
    @Override
    public void Bake() {
        System.out.println("running bake");
    }

    public void Heat() {
        System.out.println("running heat in microwave");
        super.Bake();
    }
}
