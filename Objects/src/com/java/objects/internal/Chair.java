package com.java.objects.internal;

import java.util.Objects;

public class Chair {
    private String material;
    private String color;
    private int price;
    private boolean foldable;

    public Chair(String material, String color, int price, boolean foldable) {
        this.material = material;
        this.color = color;
        this.price = price;
        this.foldable = foldable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chair) {
            Chair chair = (Chair) obj;
            if (Objects.equals(this.material, chair.material) && Objects.equals(this.color, chair.color)) {
                System.out.println("Chair is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Chair[material:" + material + ", color:" + color + ", price:" + price + ", foldable:" + foldable + "]";
    }
}
