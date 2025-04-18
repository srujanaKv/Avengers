package com.java.objects.internal;

import java.util.Objects;

public class Bicycle {
    private String type;
    private String brand;
    private int gearCount;
    private boolean isElectric;

    public Bicycle(String type, String brand, int gearCount, boolean isElectric) {
        this.type = type;
        this.brand = brand;
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) obj;
            if (Objects.equals(this.type, bicycle.type) && Objects.equals(this.brand, bicycle.brand)) {
                System.out.println("Bicycle is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bicycle[type:" + type + ", brand:" + brand + ", gearCount:" + gearCount + ", isElectric:" + isElectric + "]";
    }
}
