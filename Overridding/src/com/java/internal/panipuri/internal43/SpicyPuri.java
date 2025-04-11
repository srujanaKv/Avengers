package com.java.internal.panipuri.internal43;

public class SpicyPuri extends Panipuri {
    @Override
    public void Serve() {
        System.out.println("running serve");
    }

    public void Taste() {
        System.out.println("running taste in spicy puri");
        super.Serve();
    }
}
