package com.java.internal.halwa.internal84;

public class CarrotHalwa extends Halwa {
    @Override
    public void Mix() {
        System.out.println("running mix");
    }

    public void Steam() {
        System.out.println("running steam in carrot halwa");
        super.Mix();
    }
}