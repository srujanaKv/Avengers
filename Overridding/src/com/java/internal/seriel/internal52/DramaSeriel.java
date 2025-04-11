package com.java.internal.seriel.internal52;

public class DramaSeriel extends Seriel {
    @Override
    public void Stream() {
        System.out.println("running stream");
    }

    public void Episode() {
        System.out.println("running episode in drama seriel");
        super.Stream();
    }
}
