package com.java.internal.ocean.internal22;

public class Pacific extends Ocean {
    @Override
    public void Wave() {

        System.out.println("running wave");
    }

    public void Deep() {
        System.out.println("running deep in pacific");
        super.Wave();
    }
}
