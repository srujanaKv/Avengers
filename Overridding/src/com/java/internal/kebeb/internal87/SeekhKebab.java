package com.java.internal.kebeb.internal87;

public class SeekhKebab extends Kebab {
    @Override
    public void Grill() {
        System.out.println("running grill");
    }

    public void Skewer() {
        System.out.println("running skewer in seekh kebab");
        super.Grill();
    }
}
