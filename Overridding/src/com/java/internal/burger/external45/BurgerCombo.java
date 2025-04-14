package com.java.internal.burger.external45;

import com.java.internal.burger.internal45.Burger;
import com.java.internal.burger.internal45.VegBurger;

public class BurgerCombo {

    public void prepareMeal(Burger item) {
        if (item != null) {
            item.Grill();
            if (item instanceof VegBurger) {
                VegBurger vegItem = (VegBurger) item;
                vegItem.Serve();
            } else {
                System.err.println("This is not a VegBurger");
            }
        } else {
            System.err.println("Burger item is null");
        }
    }
}
