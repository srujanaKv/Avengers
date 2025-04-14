package com.java.internal.spiderman.external66;

import com.java.internal.spiderman.internal66.Spiderman;
import com.java.internal.spiderman.internal66.MilesMorales;

public class SpiderVerseRunner {

    public void action(Spiderman spiderman) {
        if (spiderman != null) {
            spiderman.Swing();
            if (spiderman instanceof MilesMorales) {
                MilesMorales miles = (MilesMorales) spiderman;
                miles.web();
            }
        } else {
            System.out.println("No spiderman to act upon.");
        }
    }
}
