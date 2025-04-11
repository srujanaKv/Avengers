package com.java.internal.bournvita.internal61;

public class ChocoBournvita extends Bournvita {
    @Override
    public void Mix() {
        System.out.println("running mix");
    }

    public void Flavor() {
        System.out.println("running flavor in choco bournvita");
        super.Mix();
    }
}
