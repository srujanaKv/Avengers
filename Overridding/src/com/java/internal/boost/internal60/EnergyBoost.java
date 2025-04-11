package com.java.internal.boost.internal60;

public class EnergyBoost extends Boost {
    @Override
    public void Drink() {
        System.out.println("running drink");
    }

    public void Energize() {
        System.out.println("running energize in energy boost");
        super.Drink();
    }
}
