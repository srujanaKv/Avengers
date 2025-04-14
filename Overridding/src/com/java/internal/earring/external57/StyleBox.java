package com.java.internal.earring.external57;

import com.java.internal.earring.internal57.Earring;
import com.java.internal.earring.internal57.StudEarring;

public class StyleBox {

    public void display(Earring accessory) {
        if (accessory != null) {
            accessory.Wear();
            if (accessory instanceof StudEarring) {
                StudEarring stud = (StudEarring) accessory;
                stud.Sparkle();
            } else {
                System.err.println("This is not a stud earring");
            }
        } else {
            System.err.println("Earring is null");
        }
    }
}
