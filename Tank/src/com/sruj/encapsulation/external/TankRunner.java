package com.sruj.encapsulation.external;

import com.sruj.encapsulation.external.TankResearch;
import com.sruj.encapsulation.internal.*;

public class TankRunner {
    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        tracker.trackTank();

        TankResearch research = new TankResearch();
        research.studyTank();
    }
}