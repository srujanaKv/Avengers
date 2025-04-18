package com.java.objects.internal;

import java.util.Objects;

public class Chocolate {
    private String type;
    private String flavor;
    private int weight;
    private boolean isVegan;

    public Chocolate(String type, String flavor, int weight, boolean isVegan) {
        this.type = type;
        this.flavor = flavor;
        this.weight = weight;
        this.isVegan = isVegan;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chocolate) {
            Chocolate chocolate = (Chocolate) obj;
            if (Objects.equals(this.type, chocolate.type) && Objects.equals(this.flavor, chocolate.flavor)) {
                System.out.println("Chocolate is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Chocolate[type:" + type + ", flavor:" + flavor + ", weight:" + weight + "g, isVegan:" + isVegan + "]";
    }
}
