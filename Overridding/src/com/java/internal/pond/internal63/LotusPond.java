package com.java.internal.pond.internal63;

public class LotusPond extends Pond {
    @Override
    public void Reflect() {
        System.out.println("running reflect");
    }

    public void Bloom() {
        System.out.println("running bloom in lotus pond");
        super.Reflect();
    }
}
