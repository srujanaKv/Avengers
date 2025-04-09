package com.sruj.encapsulation.external;

import com.sruj.encapsulation.internal.Tank;

public class TankResearch {
    public void studyTank() {
        Tank tank = new Tank();

        System.out.println("Studying Tank:");
        System.out.println("Model: " + tank.getModel());
        System.out.println("Armor Level: " + tank.getArmorLevel());
        System.out.println("Operational: " + tank.isOperational());
        System.out.println("Fuel Capacity: " + tank.getFuelCapacity());
        System.out.println("Origin Country: " + tank.getOriginCountry());
    }
}
