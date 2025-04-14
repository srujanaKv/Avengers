package com.java.internal.SolarSystem.external4;

import com.java.internal.SolarSystem.internal4.SolarSystem;
import com.java.internal.SolarSystem.internal4.Galaxy;

public class UniverseRunner {

    public void action(SolarSystem solarSystem) {
        if (solarSystem != null) {
            solarSystem.Planets();
            if (solarSystem instanceof Galaxy) {
                Galaxy galaxy = (Galaxy) solarSystem;
                galaxy.Stars();
            }
        } else {
            System.out.println("No solar system to act upon.");
        }
    }
}
