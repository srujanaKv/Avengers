package com.java.internal.robot.internal23;

public class Android extends Robot {
    @Override
    public void Work() {
        System.out.println("running work");
    }

    public void Speak() {
        System.out.println("running speak in android");
        super.Work();
    }
}