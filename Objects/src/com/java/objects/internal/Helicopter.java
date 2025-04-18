package com.java.objects.internal;

import java.util.Objects;

public class Helicopter {
    private String model;
    private String color;
    private String engineType;
    private double speed;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Helicopter) {
            Helicopter heli = (Helicopter) obj;
            if (Objects.equals(this.model, heli.model) &&
                    Objects.equals(this.color, heli.color) &&
                    Objects.equals(this.engineType, heli.engineType) &&
                    Objects.equals(this.speed, heli.speed)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Helicopter");
        return "Model=" + model + ", Color=" + color + ", EngineType=" + engineType + ", Speed=" + speed;
    }
}

