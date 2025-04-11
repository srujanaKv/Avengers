package com.java.internal.frenchfry.internal62;

public class CrispyFry extends FrenchFry {
    @Override
    public void Fry() {
        System.out.println("running fry");
    }

    public void Serve() {
        System.out.println("running serve in crispy fry");
        super.Fry();
    }
}
