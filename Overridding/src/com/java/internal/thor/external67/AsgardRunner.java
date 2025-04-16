package com.java.internal.thor.external67;

import com.java.internal.thor.internal67.Thor;
import com.java.internal.thor.internal67.KingThor;

public class AsgardRunner {

    public void action(Thor thor) {
        if (thor != null) {
            thor.Thunder();
            if (thor instanceof KingThor) {
                KingThor king = (KingThor) thor;
                king.Hammer();
            }
        } else {
            System.out.println("No thor to summon.");
        }
    }
}
