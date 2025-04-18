package com.java.objects.internal;

import java.util.Objects;

public class Speaker {
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
        if (obj != null && obj instanceof Speaker) {
            Speaker speaker = (Speaker) obj;
            if (Objects.equals(this.brand, speaker.brand) &&
                    Objects.equals(this.type, speaker.type) &&
                    Objects.equals(this.color, speaker.color) &&
                    Objects.equals(this.price, speaker.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        System.out.println("to String of Speaker");
        return "Brand=" + brand + ", Type=" + type + ", Color=" + color + ", Price=" + price;
    }
}

