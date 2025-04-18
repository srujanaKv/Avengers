package com.java.objects.internal;

import java.util.Objects;

public class Ironman {
    private String suitModel;
    private String arcReactorType;
    private int powerLevel;
    private boolean flightEnabled;

    public Ironman(String suitModel, String arcReactorType, int powerLevel, boolean flightEnabled) {
        this.suitModel = suitModel;
        this.arcReactorType = arcReactorType;
        this.powerLevel = powerLevel;
        this.flightEnabled = flightEnabled;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ironman) {
            Ironman ironman = (Ironman) obj;
            if (Objects.equals(this.suitModel, ironman.suitModel) && Objects.equals(this.arcReactorType, ironman.arcReactorType)) {
                System.out.println("Ironman suit is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ironman[suitModel:" + suitModel + ", arcReactorType:" + arcReactorType + ", powerLevel:" + powerLevel + ", flightEnabled:" + flightEnabled + "]";
    }
}
