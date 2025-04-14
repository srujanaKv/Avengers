package com.java.internal.kebeb.external87;

import com.java.internal.kebeb.internal87.Kebab;
import com.java.internal.kebeb.internal87.SeekhKebab;

public class KebabBox {

    public void serve(Kebab k) {
        if (k != null) {
            k.Grill();
            if (k instanceof SeekhKebab) {
                SeekhKebab seekh = (SeekhKebab) k;
                seekh.Skewer();
            }
        } else {
            System.out.println("No kebab to serve.");
        }
    }
