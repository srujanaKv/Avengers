package com.java.internal.Laddu.internal82;

public class BesanLaddu extends Laddu {
    @Override
    public void Roll() {
        System.out.println("running roll");
    }

    public void Garnish() {
        System.out.println("running garnish in besan laddu");
        super.Roll();
    }
}
