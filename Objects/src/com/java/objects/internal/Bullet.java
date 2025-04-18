package com.java.objects.internal;

import java.util.Objects;

public class Bullet {
    private String model;
    private String color;
    private int engineCapacity;
    private boolean isClassic;

    public Bullet(String model, String color, int engineCapacity, boolean isClassic) {
        this.model = model;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.isClassic = isClassic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bullet) {
            Bullet bullet = (Bullet) obj;
            if (Objects.equals(this.model, bullet.model) && Objects.equals(this.color, bullet.color)) {
                System.out.println("Bullet is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bullet[model:" + model + ", color:" + color + ", engineCapacity:" + engineCapacity + "cc, isClassic:" + isClassic + "]";
    }
}

