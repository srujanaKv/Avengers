package com.java.internal.nailpolish.external53;

import com.java.internal.nailpolish.internal53.Nailpolish;
import com.java.internal.nailpolish.internal53.GlitterPolish;

public class NailPolishRunner {

    public void startNailpolishCoat(Nailpolish nailpolish) {
        if (nailpolish != null) {
            nailpolish.Coat();
            if (nailpolish instanceof GlitterPolish) {
                GlitterPolish glitterPolish = (GlitterPolish) nailpolish;
                glitterPolish.Shine();
            }
        } else {
            System.out.println("No nail polish to apply.");
        }
    }
}
