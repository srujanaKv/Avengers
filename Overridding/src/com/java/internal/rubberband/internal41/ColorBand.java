package com.java.internal.rubberband.internal41;

public class ColorBand extends Rubberband {
    @Override
    public void Stretch() {
        System.out.println("running stretch");
    }

    public void Bind() {
        System.out.println("running bind in color band");
        super.Stretch();
    }
}