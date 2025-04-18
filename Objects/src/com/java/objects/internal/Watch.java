package com.java.objects.internal;

import java.util.Objects;

public class Watch {
    private String brand;
    private String color;
    private String type;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watch) {
            Watch watch = (Watch) obj;
            if (Objects.equals(this.brand, watch.brand) &&
                    Objects.equals(this.color, watch.color) &&
                    Objects.equals(this.type, watch.type) &&
                    Objects.equals(this.price, watch.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Watch");
        return "Brand=" + brand + ", Color=" + color + ", Type=" + type + ", Price=" + price;
    }
}

