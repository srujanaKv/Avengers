package com.java.internal.vehicle.external26;

import com.java.internal.vehicle.internal26.Vehicle;
import com.java.internal.vehicle.internal26.Bullet;

public class VehicleRunner {

    public void action(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.Drive();
            if (vehicle instanceof Bullet) {
                Bullet bullet = (Bullet) vehicle;
                bullet.Speed();
            }
        } else {
            System.out.println("No vehicle to drive.");
        }
    }
}
