package com.java.internal.virus.internal98;

public class FluVirus extends Virus {
    @Override
    public void Spread() {
        System.out.println("running spread");
    }

    public void Mutate() {
        System.out.println("running mutate in flu virus");
        super.Spread();
    }
}