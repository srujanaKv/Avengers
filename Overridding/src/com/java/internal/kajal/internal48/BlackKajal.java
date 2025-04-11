package com.java.internal.kajal.internal48;

public class BlackKajal extends Kajal {
    @Override
    public void Line() {
        System.out.println("running line");
    }

    public void Smudge() {
        System.out.println("running smudge in black kajal");
        super.Line();
    }
}
