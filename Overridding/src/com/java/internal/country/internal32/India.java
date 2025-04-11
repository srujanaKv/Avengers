package com.java.internal.country.internal32;

public class India extends Country {
    @Override
    public void Govern() {
        System.out.println("running govern");
    }

    public void Culture() {
        System.out.println("running culture in india");
        super.Govern();
    }
}