package com.java.internal.lipstick.internal47;

public class Matte extends Lipstick {
    @Override
    public void Apply() {
        System.out.println("running apply");
    }

    public void Shade() {
        System.out.println("running shade in matte");
        super.Apply();
    }
}
