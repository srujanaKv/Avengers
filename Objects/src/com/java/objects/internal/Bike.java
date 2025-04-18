package com.java.objects.internal;

import java.util.Objects;

public class Bike {
    private String type;
    private String brand;
    private int gearCount;
    private boolean isElectric;

    public Bike(String type, String brand, int gearCount, boolean isElectric) {
        this.type = type;
        this.brand = brand;
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bike) {
            Bike bike = (Bike) obj;
            if (Objects.equals(this.type, bike.type) && Objects.equals(this.brand, bike.brand)) {
                System.out.println("Bike is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bike[type:" + type + ", brand:" + brand + ", gearCount:" + gearCount + ", isElectric:" + isElectric + "]";
    }
}
