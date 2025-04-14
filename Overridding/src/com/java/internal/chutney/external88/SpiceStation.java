package com.java.internal.chutney.external88;

import com.java.internal.chutney.internal88.Chutney;
import com.java.internal.chutney.internal88.MintChutney;

public class SpiceStation {

    public void serveFresh(Chutney base) {
        if (base != null) {
            base.Grind();
            if (base instanceof MintChutney) {
                MintChutney mint = (MintChutney) base;
                mint.Chill();
            } else {
                System.err.println("This is not MintChutney");
            }
        } else {
            System.err.println("Chutney is null");
        }
    }
}

