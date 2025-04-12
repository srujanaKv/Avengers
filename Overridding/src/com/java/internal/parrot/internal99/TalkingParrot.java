package com.java.internal.parrot.internal99;

public class TalkingParrot extends Parrot {
    @Override
    public void Speak() {
        System.out.println("running speak");
    }

    public void Mimic() {
        System.out.println("running mimic in talking parrot");
        super.Speak();
    }
}