package com.java.internal.machine.internal28;

public class RobotMachine extends Machine {
    @Override
    public void Operate() {
        System.out.println("running operate");
    }

    public void Task() {
        System.out.println("running task in robot machine");
        super.Operate();
    }
}
