package com.java.internal.kheer.external83;

import com.java.internal.kheer.internal83.Kheer;
import com.java.internal.kheer.internal83.RiceKheer;

public class DessertChef {

    public void serve(Kheer kheer) {
        if (kheer != null) {
            kheer.Boil();
            if (kheer instanceof RiceKheer) {
                RiceKheer rice = (RiceKheer) kheer;
                rice.Sweeten();
            }
        } else {
            System.out.println("No dessert to serve.");
        }
    }
}
