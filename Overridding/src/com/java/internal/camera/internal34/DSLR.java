package com.java.internal.camera.internal34;

public class DSLR extends Camera {
    @Override
    public void Capture() {
        System.out.println("running capture");
    }

    public void Focus() {
        System.out.println("running focus in dslr");
        super.Capture();
    }
}

