package com.java.internal.biriyani.internal86;

public class ChickenBiriyani extends Biriyani {
    @Override
    public void Cook() {
        System.out.println("running cook");
    }

    public void Serve() {
        System.out.println("running serve in chicken biriyani");
        super.Cook();
    }
}