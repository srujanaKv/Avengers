package com.in.runner;

import com.in.external.GreenValley;
import com.in.internal.Village;

public class VillageRunner {
    public static void main(String[] args) {
        Village village = new GreenValley();
        GreenValley gv = new GreenValley();

        village.supplyWater();
        village.maintainRoads();
        village.manageElectricity();
        village.runSchool();
        village.operateClinic();
        village.organizeFestivals();
        village.cleanVillage();
        village.handleGrievances();
        village.maintainFarmingSupport();

        gv.supplyWater();
        gv.maintainRoads();
        gv.manageElectricity();
        gv.runSchool();
        gv.operateClinic();
        gv.organizeFestivals();
        gv.cleanVillage();
        gv.handleGrievances();
        gv.maintainFarmingSupport();
    }
}
