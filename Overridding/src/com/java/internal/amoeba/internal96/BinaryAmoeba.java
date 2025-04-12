package com.java.internal.amoeba.internal96;

public class BinaryAmoeba extends Amoeba {
    @Override
    public void Reproduce() {
        System.out.println("running reproduce");
    }

    public void Split() {
        System.out.println("running split in binary amoeba");
        super.Reproduce();
    }
}

