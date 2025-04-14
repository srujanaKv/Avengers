package com.java.internal.IceCreamShowcase.external1;

import com.java.internal.Icecream.internal1.Icecream;
import com.java.internal.Icecream.internal1.Items;

public class IceCreamShowcase {

    public void display(Icecream icecream) {
        if (icecream != null) {
            icecream.Flavour();
            if (icecream instanceof Items) {
                Items item = (Items) icecream;
                item.fruitsalad();
            }
        } else {
            System.out.println("No Ice Cream to display.");
        }
    }
}
