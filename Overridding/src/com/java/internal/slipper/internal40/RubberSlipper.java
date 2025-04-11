package com.java.internal.slipper.internal40;

public class RubberSlipper extends Slipper {
    @Override
    public void Wear() {
        System.out.println("running wear");
    }

    public void Grip() {
        System.out.println("running grip in rubber slipper");
        super.Wear();
    }
}
