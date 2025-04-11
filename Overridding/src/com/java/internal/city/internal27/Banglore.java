package com.java.internal.city.internal27;

public class Banglore extends City {
    @Override
    public void Develop() {
        System.out.println("running develop");
    }

    public void Skyscrapers() {
        System.out.println("running skyscrapers in metropolis");
        super.Develop();
    }
}