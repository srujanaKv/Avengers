package com.java.internal.cycle.external56;

import com.java.internal.cycle.internal56.Cycle;
import com.java.internal.cycle.internal56.GearCycle;

public class CyclingExperience {

    public void startRide(Cycle bike) {
        if (bike != null) {
            bike.Ride();
            if (bike instanceof GearCycle) {
                GearCycle gearCycle = (GearCycle) bike;
                gearCycle.ShiftGear();
            } else {
                System.err.println("This is not a GearCycle");
            }
        } else {
            System.err.println("Cycle object is null");
        }
    }
}

