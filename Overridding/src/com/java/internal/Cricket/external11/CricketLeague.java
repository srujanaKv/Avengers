package com.java.internal.cricket.external11;

import com.java.internal.Cricket.internal11.Cricket;
import com.java.internal.Cricket.internal11.Ipl;

public class CricketLeague {

    public void managePlayer(Cricket match) {
        if (match != null) {
            match.Player();
            if (match instanceof Ipl) {
                Ipl iplMatch = (Ipl) match;
                iplMatch.Dhoni();
            } else {
                System.err.println("This is not an IPL match");
            }
        } else {
            System.err.println("Cricket match is null");
        }
    }
}
