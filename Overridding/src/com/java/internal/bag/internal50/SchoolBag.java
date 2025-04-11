package com.java.internal.bag.internal50;

public class SchoolBag extends Bag {
    @Override
    public void Carry() {
        System.out.println("running carry");
    }

    public void Store() {
        System.out.println("running store in school bag");
        super.Carry();
    }
}
