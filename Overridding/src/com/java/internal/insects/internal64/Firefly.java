package com.java.internal.insects.internal64;

public class Firefly extends Insects {
    @Override
    public void Crawl() {
        System.out.println("running crawl");
    }

    public void Glow() {
        System.out.println("running glow in firefly");
        super.Crawl();
    }
}
