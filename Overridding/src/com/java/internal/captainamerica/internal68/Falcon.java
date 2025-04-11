package com.java.internal.captainamerica.internal68;

public class Falcon extends CaptainAmerica {
    @Override
    public void Shield() {
        System.out.println("running shield");
    }

    public void Wings() {
        System.out.println("running wings in falcon");
        super.Shield();
    }
}
