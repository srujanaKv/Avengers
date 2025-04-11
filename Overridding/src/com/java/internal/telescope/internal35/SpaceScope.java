package com.java.internal.telescope.internal35;

public class SpaceScope extends Telescope {
    @Override
    public void Zoom() {
        System.out.println("running zoom");
    }

    public void ViewGalaxy() {
        System.out.println("running view galaxy in spacescope");
        super.Zoom();
    }
}