package com.java.internal.stone.internal21;

public class Granite extends Stone {
    @Override
    public void Weight() {
        System.out.println("running weight");
    }

    public void Texture() {
        System.out.println("running texture in granite");
        super.Weight();
    }
}
