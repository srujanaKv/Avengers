package com.java.objects.internal;

import java.util.Objects;

public class Auto {
    private String brand;
    private String color;
    private String fuelType;
    private double mileage;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Auto) {
            Auto auto = (Auto) obj;
            if (Objects.equals(this.brand, auto.brand) &&
                    Objects.equals(this.color, auto.color) &&
                    Objects.equals(this.fuelType, auto.fuelType) &&
                    Objects.equals(this.mileage, auto.mileage)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Auto");
        return "Brand=" + brand + ", Color=" + color + ", FuelType=" + fuelType + ", Mileage=" + mileage;
    }
}
