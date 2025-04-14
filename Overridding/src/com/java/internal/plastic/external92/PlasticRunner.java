package com.java.internal.plastic.external92;

import com.java.internal.plastic.internal92.Plastic;
import com.java.internal.plastic.internal92.RecycledPlastic;

public class PlasticRunner {

    public void performMold(Plastic plastic) {
        if (plastic != null) {
            plastic.Mold();
            if (plastic instanceof RecycledPlastic) {
                RecycledPlastic recycledPlastic = (RecycledPlastic) plastic;
                recycledPlastic.Recycle();
            }
        } else {
            System.out.println("No plastic to mold.");
        }
    }
}

