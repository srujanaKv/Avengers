package com.java.objects.internal;

import java.util.Objects;

public class VintageCar {
    private String modelName;
    private String manufacturer;
    private int year;
    private boolean isRestored;

    public VintageCar(String modelName, String manufacturer, int year, boolean isRestored) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.isRestored = isRestored;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof VintageCar) {
            VintageCar car = (VintageCar) obj;
            if (Objects.equals(this.modelName, car.modelName) && Objects.equals(this.manufacturer, car.manufacturer)) {
                System.out.println("Vintage car is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "VintageCar[modelName:" + modelName + ", manufacturer:" + manufacturer + ", year:" + year + ", isRestored:" + isRestored + "]";
    }
}

