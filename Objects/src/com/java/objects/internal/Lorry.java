package com.java.objects.internal;

import java.util.Objects;

public class Lorry {
    private String model;
    private String color;
    private String fuelType;
    private double capacity;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lorry) {
            Lorry lorry = (Lorry) obj;
            if (Objects.equals(this.model, lorry.model) &&
                    Objects.equals(this.color, lorry.color) &&
                    Objects.equals(this.fuelType, lorry.fuelType) &&
                    Objects.equals(this.capacity, lorry.capacity)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Lorry");
        return "Model=" + model + ", Color=" + color + ", FuelType=" + fuelType + ", Capacity=" + capacity;
    }
}
