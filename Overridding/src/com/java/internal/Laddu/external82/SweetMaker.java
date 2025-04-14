package com.java.internal.Laddu.external82;

import com.java.internal.Laddu.internal82.Laddu;
import com.java.internal.Laddu.internal82.BesanLaddu;

public class SweetMaker {

    public void prepare(Laddu laddu) {
        if (laddu != null) {
            laddu.Roll();
            if (laddu instanceof BesanLaddu) {
                BesanLaddu besan = (BesanLaddu) laddu;
                besan.Garnish();
            }
        } else {
            System.out.println("No laddu to prepare.");
        }
    }
}
