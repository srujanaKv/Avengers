package com.java.objects.internal;

import java.util.Objects;

public class IndianJeep {
    private String model;
    private String color;
    private int engineCapacity;
    private boolean is4WD;

    public IndianJeep(String model, String color, int engineCapacity, boolean is4WD) {
        this.model = model;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.is4WD = is4WD;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof IndianJeep) {
            IndianJeep jeep = (IndianJeep) obj;
            if (Objects.equals(this.model, jeep.model) && Objects.equals(this.color, jeep.color)) {
                System.out.println("Indian Jeep is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "IndianJeep[model:" + model + ", color:" + color + ", engineCapacity:" + engineCapacity + "cc, is4WD:" + is4WD + "]";
    }
}
