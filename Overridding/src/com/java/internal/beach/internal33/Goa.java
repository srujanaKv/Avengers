package com.java.internal.beach.internal33;

public class Goa extends Beach {
    @Override
    public void Relax() {
        System.out.println("running relax");
    }

    public void Party() {
        System.out.println("running party in goa");
        super.Relax();
    }
}
