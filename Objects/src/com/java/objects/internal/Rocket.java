package com.java.objects.internal;

import java.util.Objects;

public class Rocket {
    private String name;
    private String country;
    private String fuelType;
    private double height;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rocket) {
            Rocket rocket = (Rocket) obj;
            if (Objects.equals(this.name, rocket.name) &&
                    Objects.equals(this.country, rocket.country) &&
                    Objects.equals(this.fuelType, rocket.fuelType) &&
                    Objects.equals(this.height, rocket.height)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Rocket");
        return "Name=" + name + ", Country=" + country + ", FuelType=" + fuelType + ", Height=" + height;
    }
}
