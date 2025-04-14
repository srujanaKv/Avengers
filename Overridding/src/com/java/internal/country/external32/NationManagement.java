package com.java.internal.country.external32;

import com.java.internal.country.internal32.Country;
import com.java.internal.country.internal32.India;

public class NationManagement {

    public void manageGovernance(Country nation) {
        if (nation != null) {
            nation.Govern();
            if (nation instanceof India) {
                India india = (India) nation;
                india.Culture();
            } else {
                System.err.println("This is not India");
            }
        } else {
            System.err.println("Country object is null");
        }
    }
}
