package com.java.internal.panipuri.external43;

import com.java.internal.panipuri.internal43.Panipuri;
import com.java.internal.panipuri.internal43.SpicyPuri;

public class PanipuriRunner {

    public void servePuri(Panipuri puri) {
        if (puri != null) {
            puri.Serve();
            if (puri instanceof SpicyPuri) {
                SpicyPuri spicyPuri = (SpicyPuri) puri;
                spicyPuri.Taste();
            }
        } else {
            System.out.println("No puri to serve.");
        }
    }
}
