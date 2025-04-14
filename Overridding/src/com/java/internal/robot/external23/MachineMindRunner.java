package com.java.internal.robot.external23;

import com.java.internal.robot.internal23.Robot;
import com.java.internal.robot.internal23.Android;

public class MachineMindRunner {

    public void activate(Robot robot) {
        if (robot != null) {
            robot.Work();
            if (robot instanceof Android) {
                Android android = (Android) robot;
                android.Speak();
            }
        } else {
            System.out.println("No robot to activate.");
        }
    }
}

