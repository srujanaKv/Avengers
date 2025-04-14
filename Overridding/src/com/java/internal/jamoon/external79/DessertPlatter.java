package com.java.internal.jamoon.external79;

import com.java.internal.jamoon.internal79.Jamoon;
import com.java.internal.jamoon.internal79.SweetJamoon;

public class DessertPlatter {

    public void presentJamoon(Jamoon dessert) {
        if (dessert != null) {
            dessert.Taste();
            if (dessert instanceof SweetJamoon) {
                SweetJamoon sweet = (SweetJamoon) dessert;
                sweet.Serve();
            }
        } else {
            System.out.println("No dessert to present.");
        }
    }
}