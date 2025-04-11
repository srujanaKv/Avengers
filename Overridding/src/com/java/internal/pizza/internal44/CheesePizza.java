package com.java.internal.pizza.internal44;

public class CheesePizza extends Pizza {
    @Override
    public void Bake() {
        System.out.println("running bake");
    }

    public void Slice() {
        System.out.println("running slice in cheese pizza");
        super.Bake();
    }
}
