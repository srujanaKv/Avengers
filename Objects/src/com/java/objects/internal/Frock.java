package com.java.objects.internal;

import java.util.Objects;

public class Frock {
    private String brand;
    private String color;
    private String size;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Frock) {
            Frock frock = (Frock) obj;
            if (Objects.equals(this.brand, frock.brand) &&
                    Objects.equals(this.color, frock.color) &&
                    Objects.equals(this.size, frock.size) &&
                    Objects.equals(this.price, frock.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Frock");
        return "Brand=" + brand + ", Color=" + color + ", Size=" + size + ", Price=" + price;
    }
}
