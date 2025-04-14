package com.java.internal.bournvita.external61;

import com.java.internal.bournvita.internal61.Bournvita;
import com.java.internal.bournvita.internal61.ChocoBournvita;

public class BournvitaBlend {

    public void perform(Bournvita bournvita) {
        if (bournvita != null) {
            bournvita.Mix();
            if (bournvita instanceof ChocoBournvita) {
                ChocoBournvita choco = (ChocoBournvita) bournvita;
                choco.Flavor();
            } else {
                System.err.println("This is not ChocoBournvita");
            }
        } else {
            System.err.println("Bournvita is null");
        }
    }
}
