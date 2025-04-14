package com.java.internal.metro.external13;

import com.java.internal.metro.internal13.Metro;
import com.java.internal.metro.internal13.Train;

public class RailRunner {

    public void checkMovement(Metro metro) {
        if (metro != null) {
            metro.Move();
            if (metro instanceof Train) {
                Train train = (Train) metro;
                train.Speed();
            }
        } else {
            System.out.println("No metro provided.");
        }
    }
}
