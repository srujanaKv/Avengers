package com.java.internal.paint.internal58;

public class WallPaint extends Paint {
    @Override
    public void Apply() {
        System.out.println("running apply");
    }

    public void Dry() {
        System.out.println("running dry in wall paint");
        super.Apply();
    }
}