package com.java.internal.tower.internal76;

public class WatchTower extends Tower {
    @Override
    public void Stand() {
        System.out.println("running stand");
    }

    public void Observe() {
        System.out.println("running observe in watch tower");
        super.Stand();
    }
}
