package com.java.objects.internal;

import java.util.Objects;

public class Headphones {
    private String brand;
    private String type;
    private String color;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Headphones) {
            Headphones headphones = (Headphones) obj;
            if (Objects.equals(this.brand, headphones.brand) &&
                    Objects.equals(this.type, headphones.type) &&
                    Objects.equals(this.color, headphones.color) &&
                    Objects.equals(this.price, headphones.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Headphones");
        return "Brand=" + brand + ", Type=" + type + ", Color=" + color + ", Price=" + price;
    }
}
