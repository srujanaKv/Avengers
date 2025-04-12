package com.java.internal.masala.internal85;

public class GaramMasala extends Masala {
    @Override
    public void Spice() {
        System.out.println("running spice");
    }

    public void Mix() {
        System.out.println("running mix in garam masala");
        super.Spice();
    }
}
