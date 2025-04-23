package com.in.external;

import com.in.internal.Village;

public class GreenValley implements Village {
    @Override
    public void supplyWater() {
        System.out.println("Supplying clean water in GreenValley");
    }

    @Override
    public void maintainRoads() {
        System.out.println("Maintaining village roads in GreenValley");
    }

    @Override
    public void manageElectricity() {
        System.out.println("Managing electricity in GreenValley");
    }

    @Override
    public void runSchool() {
        System.out.println("Running village school in GreenValley");
    }

    @Override
    public void operateClinic() {
        System.out.println("Operating health clinic in GreenValley");
    }

    @Override
    public void organizeFestivals() {
        System.out.println("Organizing festivals in GreenValley");
    }

    @Override
    public void cleanVillage() {
        System.out.println("Cleaning the village in GreenValley");
    }

    @Override
    public void handleGrievances() {
        System.out.println("Handling public grievances in GreenValley");
    }

    @Override
    public void maintainFarmingSupport() {
        System.out.println("Maintaining farming support systems in GreenValley");
    }
}
