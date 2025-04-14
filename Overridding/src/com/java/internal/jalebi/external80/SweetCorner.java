package com.java.internal.jalebi.external80;

import com.java.internal.jalebi.internal80.Jalebi;
import com.java.internal.jalebi.internal80.HotJalebi;

public class SweetCorner {

    public void serveSweet(Jalebi sweet) {
        if (sweet != null) {
            sweet.Swirl();
            if (sweet instanceof HotJalebi) {
                HotJalebi hot = (HotJalebi) sweet;
                hot.Dip();
            }
        } else {
            System.out.println("No sweet available to serve.");
        }
    }
}