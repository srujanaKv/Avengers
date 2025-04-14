package com.java.internal.machine.external28;

import com.java.internal.machine.internal28.Machine;
import com.java.internal.machine.internal28.RobotMachine;

public class ControlPanel {

    public void manageMachine(Machine machine) {
        if (machine != null) {
            machine.Operate();
            if (machine instanceof RobotMachine) {
                RobotMachine robot = (RobotMachine) machine;
                robot.Task();
            }
        } else {
            System.out.println("No machine to manage.");
        }
    }
}
