package com.java.objects.internal;

import java.util.Objects;

public class Plane {
    private String model;
    private String airline;
    private String engineType;
    private double range;

    public void setModel(String model) {
        this.model = model;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Plane) {
            Plane plane = (Plane) obj;
            if (Objects.equals(this.model, plane.model) &&
                    Objects.equals(this.airline, plane.airline) &&
                    Objects.equals(this.engineType, plane.engineType) &&
                    Objects.equals(this.range, plane.range)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Plane");
        return "Model=" + model + ", Airline=" + airline + ", EngineType=" + engineType + ", Range=" + range;
    }
}

