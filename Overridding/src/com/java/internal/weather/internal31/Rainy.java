package com.java.internal.weather.internal31;

public class Rainy extends Weather {
    @Override
    public void Change() {
        System.out.println("running change");
    }

    public void Wet() {
        System.out.println("running wet in rainy");
        super.Change();
    }
}