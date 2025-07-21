package com.java.internal.virus.external98;

import com.java.internal.virus.internal98.Virus;
import com.java.internal.virus.internal98.FluVirus;

public class VirusRunner {

    public void action(Virus virus) {
        if (virus != null) {
            virus.Spread();
            if (virus instanceof FluVirus) {
                FluVirus flu = (FluVirus) virus;
                flu.Mutate();
            }
        } else {
            System.out.println("No virus to act upon.");
        }
    }
}
