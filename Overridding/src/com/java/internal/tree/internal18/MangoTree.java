package com.java.internal.tree.internal18;

public class MangoTree extends Tree {
    @Override
    public void Grow() {
        System.out.println("running grow");
    }

    public void Fruit() {
        System.out.println("running fruit in mango tree");
        super.Grow();
    }
}
