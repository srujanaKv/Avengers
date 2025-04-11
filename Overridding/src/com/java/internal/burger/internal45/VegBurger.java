package com.java.internal.burger.internal45;

public class VegBurger extends Burger {
    @Override
    public void Grill() {
        System.out.println("running grill");
    }

    public void Serve() {
        System.out.println("running serve in veg burger");
        super.Grill();
    }
}
