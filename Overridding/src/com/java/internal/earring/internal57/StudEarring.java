package com.java.internal.earring.internal57;

public class StudEarring extends Earring {
    @Override
    public void Wear() {
        System.out.println("running wear");
    }

    public void Sparkle() {
        System.out.println("running sparkle in stud earring");
        super.Wear();
    }
}