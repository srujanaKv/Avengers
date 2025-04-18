package com.java.objects.internal;

import java.util.Objects;

public class Lipstick {
    private String brand;
    private String shade;
    private int price;
    private boolean matte;

    public Lipstick(String brand, String shade, int price, boolean matte) {
        this.brand = brand;
        this.shade = shade;
        this.price = price;
        this.matte = matte;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lipstick) {
            Lipstick lipstick = (Lipstick) obj;
            if (Objects.equals(this.brand, lipstick.brand) && Objects.equals(this.shade, lipstick.shade)) {
                System.out.println("Lipstick is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lipstick[brand:" + brand + ", shade:" + shade + ", price:" + price + ", matte:" + matte + "]";
    }
}

