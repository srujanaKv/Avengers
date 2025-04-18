package com.java.objects.internal;

import java.util.Objects;

public class Handbag {
    private String brand;
    private String material;
    private String color;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Handbag) {
            Handbag handbag = (Handbag) obj;
            if (Objects.equals(this.brand, handbag.brand) &&
                    Objects.equals(this.material, handbag.material) &&
                    Objects.equals(this.color, handbag.color) &&
                    Objects.equals(this.price, handbag.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Handbag");
        return "Brand=" + brand + ", Material=" + material + ", Color=" + color + ", Price=" + price;
    }
}

