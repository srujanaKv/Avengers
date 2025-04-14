package com.java.internal.pizza.external44;

import com.java.internal.pizza.internal44.Pizza;
import com.java.internal.pizza.internal44.CheesePizza;

public class PizzaRunner {

    public void performBake(Pizza pizza) {
        if (pizza != null) {
            pizza.Bake();
            if (pizza instanceof CheesePizza) {
                CheesePizza cheesePizza = (CheesePizza) pizza;
                cheesePizza.Slice();
            }
        } else {
            System.out.println("No pizza to bake.");
        }
    }
}
