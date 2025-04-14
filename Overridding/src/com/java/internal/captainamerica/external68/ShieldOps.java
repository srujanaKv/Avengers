package com.java.internal.captainamerica.external68;

import com.java.internal.captainamerica.internal68.CaptainAmerica;
import com.java.internal.captainamerica.internal68.Falcon;

public class ShieldOps {

    public void activateDefense(CaptainAmerica hero) {
        if (hero != null) {
            hero.Shield();
            if (hero instanceof Falcon) {
                Falcon wingedAlly = (Falcon) hero;
                wingedAlly.Wings();
            } else {
                System.err.println("This is not Falcon");
            }
        } else {
            System.err.println("CaptainAmerica object is null");
        }
    }
}

