package com.java.internal.cow.internal95;

public class DairyCow extends Cow {
    @Override
    public void Moo() {
        System.out.println("running moo");
    }

    public void Milk() {
        System.out.println("running milk in dairy cow");
        super.Moo();
    }
}
