package com.java.internal.Fridge.internal70;

public class DoubleDoorFridge extends Fridge {
    @Override
    public void Cool() {
        System.out.println("running cool");
    }

    public void Freeze() {
        System.out.println("running freeze in double door fridge");
        super.Cool();
    }
}
