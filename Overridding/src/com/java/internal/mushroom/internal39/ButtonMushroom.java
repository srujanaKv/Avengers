package com.java.internal.mushroom.internal39;

public class ButtonMushroom extends Mushroom {
    @Override
    public void Grow() {
        System.out.println("running grow");
    }

    public void Cook() {
        System.out.println("running cook in button mushroom");
        super.Grow();
    }
}