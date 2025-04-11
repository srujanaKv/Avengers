package com.java.internal.door.internal14;

public class Gate extends Door {
    @Override
    public void Open() {
        System.out.println("running open");
    }

    public void Lock() {
        System.out.println("running lock in gate");
        super.Open();
    }
}