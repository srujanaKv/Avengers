package com.java.internal.ironman.internal65;

public class Mark42 extends Ironman {
    @Override
    public void Fly() {
        System.out.println("running fly");
    }

    public void Shoot() {
        System.out.println("running shoot in mark 42");
        super.Fly();
    }
}
