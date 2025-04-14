package com.java.internal.kerala.external91;

import com.java.internal.kerala.internal91.Kerala;
import com.java.internal.kerala.internal91.GodsOwnCountry;

public class KeralaBox {

    public void explore(Kerala k) {
        if (k != null) {
            k.Culture();
            if (k instanceof GodsOwnCountry) {
                GodsOwnCountry goc = (GodsOwnCountry) k;
                goc.Tourism();
            }
        } else {
            System.out.println("No Kerala instance to explore.");
        }
    }
}