package com.java.internal.Car.external5;

import com.java.internal.Car.internal5.Car;
import com.java.internal.Car.internal5.Vintage;

public class GarageVault {

    public void inspectVehicle(Car automobile) {
        if (automobile != null) {
            automobile.Ford();
            if (automobile instanceof Vintage) {
                Vintage classicModel = (Vintage) automobile;
                classicModel.Benz();
            } else {
                System.err.println("This is not a Vintage car");
            }
        } else {
            System.err.println("Car object is null");
        }
    }
}
