package com.in.runner;

import com.in.external.AdventureWorld;
import com.in.internal.ThemePark;

public class ThemeParkRunner {
    public static void main(String[] args) {
        ThemePark park = new AdventureWorld();
        AdventureWorld adventureWorld = new AdventureWorld();

        park.openPark();
        park.sellTickets();
        park.operateRides();
        park.organizeParade();
        park.manageFoodCourt();
        park.ensureSafety();
        park.closePark();

        adventureWorld.openPark();
        adventureWorld.sellTickets();
        adventureWorld.operateRides();
        adventureWorld.organizeParade();
        adventureWorld.manageFoodCourt();
        adventureWorld.ensureSafety();
        adventureWorld.closePark();
    }
}

