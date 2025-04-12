package com.java.internal.bacteria.internal97;

public class EColi extends Bacteria {
    @Override
    public void Multiply() {
        System.out.println("running multiply");
    }

    public void Infect() {
        System.out.println("running infect in e.coli");
        super.Multiply();
    }
}