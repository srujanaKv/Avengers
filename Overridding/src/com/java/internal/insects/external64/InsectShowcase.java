package com.java.internal.insects.external64;

import com.java.internal.insects.internal64.Insects;
import com.java.internal.insects.internal64.Firefly;

public class InsectShowcase {

    public void display(Insects insect) {
        if (insect != null) {
            insect.Crawl();
            if (insect instanceof Firefly) {
                Firefly firefly = (Firefly) insect;
                firefly.Glow();
            }
        } else {
            System.out.println("No Insect to display.");
        }
    }
}