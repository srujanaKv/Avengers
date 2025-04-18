package com.java.objects.internal;

import java.util.Objects;

public class Dragon {
    private String breed;
    private String color;
    private int wingSpan;
    private boolean canFly;

    public Dragon(String breed, String color, int wingSpan, boolean canFly) {
        this.breed = breed;
        this.color = color;
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Dragon) {
            Dragon dragon = (Dragon) obj;
            if (Objects.equals(this.breed, dragon.breed) && Objects.equals(this.color, dragon.color)) {
                System.out.println("Dragon is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dragon[breed:" + breed + ", color:" + color + ", wingSpan:" + wingSpan + "m, canFly:" + canFly + "]";
    }
}

