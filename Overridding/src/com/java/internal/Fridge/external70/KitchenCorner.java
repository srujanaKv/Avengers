package com.java.internal.Fridge.external70;

import com.java.internal.Fridge.internal70.Fridge;
import com.java.internal.Fridge.internal70.DoubleDoorFridge;

public class KitchenCorner {

    public void showcase(Fridge appliance) {
        if (appliance != null) {
            appliance.Cool();
            if (appliance instanceof DoubleDoorFridge) {
                DoubleDoorFridge doubleDoor = (DoubleDoorFridge) appliance;
                doubleDoor.Freeze();
            }
        } else {
            System.out.println("No appliance to display.");
        }
    }
}