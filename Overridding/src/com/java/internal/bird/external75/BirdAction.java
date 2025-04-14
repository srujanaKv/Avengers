package com.java.internal.bird.external75;

import com.java.internal.bird.internal75.Bird;
import com.java.internal.bird.internal75.Sparrow;

public class BirdAction {

    public void performAction(Bird bird) {
        if (bird != null) {
            bird.Fly();
            if (bird instanceof Sparrow) {
                Sparrow sparrow = (Sparrow) bird;
                sparrow.Chirp();
            } else {
                System.err.println("This is not a sparrow");
            }
        } else {
            System.err.println("Bird is null");
        }
    }
}
