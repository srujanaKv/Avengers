package com.java.internal.cloud.internal20;

public class StormCloud extends Cloud {
    @Override
    public void Rain() {
        System.out.println("running rain");
    }

    public void Thunder() {
        System.out.println("running thunder in storm cloud");
        super.Rain();
    }
}