package com.java.internal.watch.internal55;

public class SmartWatch extends Watch {
    @Override
    public void ShowTime() {
        System.out.println("running show time");
    }

    public void Notify() {
        System.out.println("running notify in smart watch");
        super.ShowTime();
    }
}
