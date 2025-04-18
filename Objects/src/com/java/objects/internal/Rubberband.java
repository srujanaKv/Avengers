package com.java.objects.internal;

import java.util.Objects;

public class Rubberband {
    private String brand;
    private String color;
    private int quantity;
    private boolean stretchable;

    public Rubberband(String brand, String color, int quantity, boolean stretchable) {
        this.brand = brand;
        this.color = color;
        this.quantity = quantity;
        this.stretchable = stretchable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rubberband) {
            Rubberband rubberband = (Rubberband) obj;
            if (Objects.equals(this.brand, rubberband.brand) && Objects.equals(this.color, rubberband.color)) {
                System.out.println("Rubberband is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rubberband[brand:" + brand + ", color:" + color + ", quantity:" + quantity + ", stretchable:" + stretchable + "]";
    }
}
