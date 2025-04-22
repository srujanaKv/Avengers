package com.in.external;

import com.in.internal.ThemePark;

public class AdventureWorld implements ThemePark {
    @Override
    public void openPark() {
        System.out.println("Opening AdventureWorld Theme Park");
    }

    @Override
    public void sellTickets() {
        System.out.println("Selling tickets at AdventureWorld");
    }

    @Override
    public void operateRides() {
        System.out.println("Operating rides at AdventureWorld");
    }

    @Override
    public void organizeParade() {
        System.out.println("Organizing parade at AdventureWorld");
    }

    @Override
    public void manageFoodCourt() {
        System.out.println("Managing food court at AdventureWorld");
    }

    @Override
    public void ensureSafety() {
        System.out.println("Ensuring safety at AdventureWorld");
    }

    @Override
    public void closePark() {
        System.out.println("Closing AdventureWorld Theme Park");
    }
}
