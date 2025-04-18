package com.java.objects.internal;

import java.util.Objects;

public class Shoes {
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
        if (obj != null && obj instanceof Shoes) {
            Shoes shoes = (Shoes) obj;
            if (Objects.equals(this.brand, shoes.brand) &&
                    Objects.equals(this.color, shoes.color) &&
                    Objects.equals(this.size, shoes.size) &&
                    Objects.equals(this.price, shoes.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Shoes");
        return "Brand=" + brand + ", Color=" + color + ", Size=" + size + ", Price=" + price;
    }
}
