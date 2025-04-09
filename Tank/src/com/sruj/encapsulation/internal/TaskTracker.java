package com.sruj.encapsulation.internal;

public class TaskTracker {
    public void trackTank() {
        Tank tank = new Tank();

        System.out.println("Initial Tank Details:");
        System.out.println("Model: " + tank.getModel());
        System.out.println("Armor Level: " + tank.getArmorLevel());
        System.out.println("Operational: " + tank.isOperational());
        System.out.println("Fuel Capacity: " + tank.getFuelCapacity());
        System.out.println("Origin Country: " + tank.getOriginCountry());


        tank.setModel("Leopard 2A7");
        tank.setArmorLevel(120);
        tank.setOperational(false);
        tank.setFuelCapacity(600.5);
        tank.setOriginCountry("Germany");

        System.out.println("\nUpdated Tank Details:");
        System.out.println("Model: " + tank.getModel());
        System.out.println("Armor Level: " + tank.getArmorLevel());
        System.out.println("Operational: " + tank.isOperational());
        System.out.println("Fuel Capacity: " + tank.getFuelCapacity());
        System.out.println("Origin Country: " + tank.getOriginCountry());
    }
}