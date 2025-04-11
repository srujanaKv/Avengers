package com.java.internal.brinjal.internal16;

public class PurpleBrinjal extends Brinjal {
    @Override
    public void Cook() {
        System.out.println("running cook");
    }

    public void Taste() {
        System.out.println("running taste in purple brinjal");
        super.Cook();
    }
}