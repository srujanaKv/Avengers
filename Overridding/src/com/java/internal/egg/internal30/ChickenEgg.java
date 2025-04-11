package com.java.internal.egg.internal30;

public class ChickenEgg extends Egg {
    @Override
    public void Hatch() {
        System.out.println("running hatch");
    }

    public void Shell() {
        System.out.println("running shell in chicken egg");
        super.Hatch();
    }
}