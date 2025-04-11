package com.java.internal.river.internal19;

public class Ganga extends River {
    @Override
    public void Flow() {
        System.out.println("running flow");
    }

    public void Purity() {
        System.out.println("running purity in ganga");
        super.Flow();
    }
}
