package com.java.internal.tower.external76;

import com.java.internal.tower.internal76.Tower;
import com.java.internal.tower.internal76.WatchTower;

public class TowerRunner {

    public void action(Tower tower) {
        if (tower != null) {
            tower.Stand();
            if (tower instanceof WatchTower) {
                WatchTower watch = (WatchTower) tower;
                watch.Observe();
            }
        } else {
            System.out.println("No tower to operate.");
        }
    }
}

