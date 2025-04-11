package com.java.internal.cycle.internal56;

public class GearCycle extends Cycle {
    @Override
    public void Ride() {
        System.out.println("running ride");
    }

    public void ShiftGear() {
        System.out.println("running shift gear in gear cycle");
        super.Ride();
    }
}
