package com.java.internal.besheet.internal69;

public class CottonSheet extends Bedsheet {
    @Override
    public void Spread() {
        System.out.println("running spread");
    }

    public void Fold() {
        System.out.println("running fold in cotton sheet");
        super.Spread();
    }
}
