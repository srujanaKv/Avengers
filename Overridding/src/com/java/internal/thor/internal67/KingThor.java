package com.java.internal.thor.internal67;

public class KingThor extends Thor {
    @Override
    public void Thunder() {
        System.out.println("running thunder");
    }

    public void Hammer() {
        System.out.println("running hammer in king thor");
        super.Thunder();
    }
}