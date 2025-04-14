package com.java.internal.cow.external95;

import com.java.internal.cow.internal95.Cow;
import com.java.internal.cow.internal95.DairyCow;

public class FarmActivities {

    public void performCowActivities(Cow animal) {
        if (animal != null) {
            animal.Moo();
            if (animal instanceof DairyCow) {
                DairyCow dairyCow = (DairyCow) animal;
                dairyCow.Milk();
            } else {
                System.err.println("This is not a DairyCow");
            }
        } else {
            System.err.println("Cow object is null");
        }
    }
}
