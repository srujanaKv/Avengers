package com.java.objects.internal;

import java.util.Objects;

public class Curtain {
    private String fabric;
    private String color;
    private String pattern;
    private double price;

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Curtain) {
            Curtain curtain = (Curtain) obj;
            if (Objects.equals(this.fabric, curtain.fabric) &&
                    Objects.equals(this.color, curtain.color) &&
                    Objects.equals(this.pattern, curtain.pattern) &&
                    Objects.equals(this.price, curtain.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Curtain");
        return "Fabric=" + fabric + ", Color=" + color + ", Pattern=" + pattern + ", Price=" + price;
    }
}
