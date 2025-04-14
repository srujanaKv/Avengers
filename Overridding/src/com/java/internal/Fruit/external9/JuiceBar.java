package com.java.internal.Fruit.external9;

import com.java.internal.Fruit.internal9.Fruit;
import com.java.internal.Fruit.internal9.Fresh;

public class JuiceBar {

    public void display(Fruit item) {
        if (item != null) {
            item.Pomegranate();
            if (item instanceof Fresh) {
                Fresh f = (Fresh) item;
                f.Watermelon();
            }
        } else {
            System.out.println("No fruit to display.");
        }
    }
}