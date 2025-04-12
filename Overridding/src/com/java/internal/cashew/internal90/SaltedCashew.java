package com.java.internal.cashew.internal90;

public class SaltedCashew extends Cashew {
    @Override
    public void Crunch() {
        System.out.println("running crunch");
    }

    public void Salt() {
        System.out.println("running salt in salted cashew");
        super.Crunch();
    }
}
