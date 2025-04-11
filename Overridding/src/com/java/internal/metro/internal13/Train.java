package com.java.internal.metro.internal13;

public class Train extends Metro {
    @Override
    public void Move() {
        System.out.println("running move");
    }

    public void Speed() {
        System.out.println("running speed in train");
        super.Move();
    }
}
