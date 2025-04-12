package com.java.internal.chutney.internal88;

public class MintChutney extends Chutney {
    @Override
    public void Grind() {
        System.out.println("running grind");
    }

    public void Chill() {
        System.out.println("running chill in mint chutney");
        super.Grind();
    }
}
