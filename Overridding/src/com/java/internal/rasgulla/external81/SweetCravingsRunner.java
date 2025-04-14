package com.java.internal.rasgulla.external81;

import com.java.internal.rasgulla.internal81.Rasgulla;
import com.java.internal.rasgulla.internal81.SoftRasgulla;

public class SweetCravingsRunner {

    public void serveSweet(Rasgulla rasgulla) {
        if (rasgulla != null) {
            rasgulla.Soak();
            if (rasgulla instanceof SoftRasgulla) {
                SoftRasgulla soft = (SoftRasgulla) rasgulla;
                soft.Squeeze();
            }
        } else {
            System.out.println("No rasgulla to serve.");
        }
    }
}

