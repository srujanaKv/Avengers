package com.in.external;

import com.in.internal.CoffeeShop;

public class BrewBuzz implements CoffeeShop {
    @Override
    public void openShop() {
        System.out.println("Opening BrewBuzz Coffee Shop");
    }

    @Override
    public void takeOrders() {
        System.out.println("Taking customer orders at BrewBuzz");
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Preparing coffee at BrewBuzz");
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving customers at BrewBuzz");
    }

    @Override
    public void cleanTables() {
        System.out.println("Cleaning tables at BrewBuzz");
    }

    @Override
    public void restockSupplies() {
        System.out.println("Restocking supplies at BrewBuzz");
    }

    @Override
    public void manageBilling() {
        System.out.println("Managing billing at BrewBuzz");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing relaxing music at BrewBuzz");
    }

    @Override
    public void closeShop() {
        System.out.println("Closing BrewBuzz Coffee Shop");
    }
}
