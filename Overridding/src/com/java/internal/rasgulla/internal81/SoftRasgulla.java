package com.java.internal.rasgulla.internal81;

public class SoftRasgulla extends Rasgulla {
    @Override
    public void Soak() {
        System.out.println("running soak");
    }

    public void Squeeze() {
        System.out.println("running squeeze in soft rasgulla");
        super.Soak();
    }
}
