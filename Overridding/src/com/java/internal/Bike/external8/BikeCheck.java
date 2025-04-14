package com.java.internal.Bike.external8;

import com.java.internal.Bike.internal8.Bike;
import com.java.internal.Bike.internal8.Company;

public class BikeCheck {

    public void check(Bike bike) {
        if (bike != null) {
            bike.Yamaha();
            if (bike instanceof Company) {
                Company company = (Company) bike;
                company.Rx100();
            } else {
                System.err.println("This is not a Company bike");
            }
        } else {
            System.err.println("Bike is null");
        }
    }
}

