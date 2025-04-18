package com.java.objects.internal;

import java.util.Objects;

public class Bird {
    private String species;
    private String color;
    private int wingspan;
    private boolean canFly;

    public Bird(String species, String color, int wingspan, boolean canFly) {
        this.species = species;
        this.color = color;
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bird) {
            Bird bird = (Bird) obj;
            if (Objects.equals(this.species, bird.species) && Objects.equals(this.color, bird.color)) {
                System.out.println("Bird is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bird[species:" + species + ", color:" + color + ", wingspan:" + wingspan + "cm, canFly:" + canFly + "]";
    }
}
