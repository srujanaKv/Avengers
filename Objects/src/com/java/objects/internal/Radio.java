package com.java.objects.internal;

import java.util.Objects;

public class Radio {
    private String brand;
    private String color;
    private int frequencyRange;
    private boolean isDigital;

    public Radio(String brand, String color, int frequencyRange, boolean isDigital) {
        this.brand = brand;
        this.color = color;
        this.frequencyRange = frequencyRange;
        this.isDigital = isDigital;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Radio) {
            Radio radio = (Radio) obj;
            if (Objects.equals(this.brand, radio.brand) && Objects.equals(this.color, radio.color)
                    && this.frequencyRange == radio.frequencyRange && this.isDigital == radio.isDigital) {
                System.out.println("Radio is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Radio[brand:" + brand + ", color:" + color + ", frequencyRange:" + frequencyRange + "MHz, isDigital:" + isDigital + "]";
    }
}
