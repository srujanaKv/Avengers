package com.java.internal.plastic.internal92;

public class RecycledPlastic extends Plastic {
    @Override
    public void Mold() {
        System.out.println("running mold");
    }

    public void Recycle() {
        System.out.println("running recycle in recycled plastic");
        super.Mold();
    }
}