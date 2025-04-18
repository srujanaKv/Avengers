package com.java.objects.internal;

import java.util.Objects;

public class Nailpolish {
    private String brand;
    private String shade;
    private int price;
    private boolean quickDry;

    public Nailpolish(String brand, String shade, int price, boolean quickDry) {
        this.brand = brand;
        this.shade = shade;
        this.price = price;
        this.quickDry = quickDry;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Nailpolish) {
            Nailpolish polish = (Nailpolish) obj;
            if (Objects.equals(this.brand, polish.brand) && Objects.equals(this.shade, polish.shade)) {
                System.out.println("Nailpolish is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nailpolish[brand:" + brand + ", shade:" + shade + ", price:" + price + ", quickDry:" + quickDry + "]";
    }
}
