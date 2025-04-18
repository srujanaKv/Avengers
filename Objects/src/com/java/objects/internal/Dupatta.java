package com.java.objects.internal;

import java.util.Objects;

public class Dupatta {
    private String brand;
    private String fabric;
    private String color;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Dupatta) {
            Dupatta dupatta = (Dupatta) obj;
            if (Objects.equals(this.brand, dupatta.brand) &&
                    Objects.equals(this.fabric, dupatta.fabric) &&
                    Objects.equals(this.color, dupatta.color) &&
                    Objects.equals(this.price, dupatta.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Dupatta");
        return "Brand=" + brand + ", Fabric=" + fabric + ", Color=" + color + ", Price=" + price;
    }
}
