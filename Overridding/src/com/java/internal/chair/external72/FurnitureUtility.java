package com.java.internal.chair.external72;

import com.java.internal.chair.internal72.Chair;
import com.java.internal.chair.internal72.WoodenChair;

public class FurnitureUtility {

    public void testComfort(Chair furniture) {
        if (furniture != null) {
            furniture.Sit();
            if (furniture instanceof WoodenChair) {
                WoodenChair wooden = (WoodenChair) furniture;
                wooden.Support();
            } else {
                System.err.println("This is not a WoodenChair");
            }
        } else {
            System.err.println("Chair is null");
        }
    }
}
