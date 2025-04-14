package com.java.internal.dress.external49;

import com.java.internal.dress.internal49.Dress;
import com.java.internal.dress.internal49.Frock;

public class DressStyler {

    public void styleDress(Dress outfit) {
        if (outfit != null) {
            outfit.Wear();
            if (outfit instanceof Frock) {
                Frock frock = (Frock) outfit;
                frock.Design();
            } else {
                System.err.println("This dress is not a frock");
            }
        } else {
            System.err.println("Dress object is null");
        }
    }
}
