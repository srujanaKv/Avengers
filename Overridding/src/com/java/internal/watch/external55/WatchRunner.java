package com.java.internal.watch.external55;

import com.java.internal.watch.internal55.Watch;
import com.java.internal.watch.internal55.SmartWatch;

public class WatchRunner {

    public void action(Watch watch) {
        if (watch != null) {
            watch.ShowTime();
            if (watch instanceof SmartWatch) {
                SmartWatch smart = (SmartWatch) watch;
                smart.Notify();
            }
        } else {
            System.out.println("No watch to act upon.");
        }
    }
}

