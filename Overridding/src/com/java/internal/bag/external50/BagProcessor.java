package com.java.internal.bag.external50;

import com.java.internal.bag.internal50.Bag;
import com.java.internal.bag.internal50.SchoolBag;

public class BagProcessor {

    public void process(Bag bag) {
        if (bag != null) {
            bag.Carry();
            if (bag instanceof SchoolBag) {
                SchoolBag schoolBag = (SchoolBag) bag;
                schoolBag.Store();
            } else {
                System.err.println("This is not a school bag");
            }
        } else {
            System.err.println("Bag is null");
        }
    }
}
