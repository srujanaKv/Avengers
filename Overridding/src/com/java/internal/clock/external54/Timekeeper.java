package com.java.internal.clock.external54;

import com.java.internal.clock.internal54.Clock;
import com.java.internal.clock.internal54.WallClock;

public class Timekeeper {

    public void checkTick(Clock timepiece) {
        if (timepiece != null) {
            timepiece.Tick();
            if (timepiece instanceof WallClock) {
                WallClock wallClock = (WallClock) timepiece;
                wallClock.Hang();
            } else {
                System.err.println("This is not a WallClock");
            }
        } else {
            System.err.println("Clock object is null");
        }
    }
}

