package com.java.internal.beach.external33;

import com.java.internal.beach.internal33.Beach;
import com.java.internal.beach.internal33.Goa;

public class BeachHandler {

    public void handle(Beach beach) {
        if (beach != null) {
            beach.Relax();
            if (beach instanceof Goa) {
                Goa goa = (Goa) beach;
                goa.Party();
            } else {
                System.err.println("This is not Goa beach");
            }
        } else {
            System.err.println("Beach is null");
        }
    }
}
