package com.java.internal.vehicle.internal26;

public class Bullet extends Vehicle {
    @Override
    public void Drive() {
        System.out.println("running drive");
    }

    public void Speed() {
        System.out.println("running speed in car");
        super.Drive();
    }
}