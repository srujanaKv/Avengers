package com.java.internal.frenchfry.external62;

import com.java.internal.frenchfry.internal62.FrenchFry;
import com.java.internal.frenchfry.internal62.CrispyFry;

public class SnackTime {

    public void serveFries(FrenchFry fry) {
        fry.Fry();
        if (fry instanceof CrispyFry) {
            CrispyFry crispy = (CrispyFry) fry;
            crispy.Serve();
        } else {
            System.out.println("Standard french fry served.");
        }
    }
}