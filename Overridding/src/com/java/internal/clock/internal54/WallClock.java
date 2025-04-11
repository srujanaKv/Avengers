package com.java.internal.clock.internal54;

public class WallClock extends Clock {
    @Override
    public void Tick() {
        System.out.println("running tick");
    }

    public void Hang() {
        System.out.println("running hang in wall clock");
        super.Tick();
    }
}
