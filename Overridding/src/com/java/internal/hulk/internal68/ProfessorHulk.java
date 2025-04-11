package com.java.internal.hulk.internal68;

public class ProfessorHulk extends Hulk {
    @Override
    public void Smash() {
        System.out.println("running smash");
    }

    public void Think() {
        System.out.println("running think in professor hulk");
        super.Smash();
    }
}
