package com.java.internal.kheer.internal83;

public class RiceKheer extends Kheer {
    @Override
    public void Boil() {
        System.out.println("running boil");
    }

    public void Sweeten() {
        System.out.println("running sweeten in rice kheer");
        super.Boil();
    }
}
