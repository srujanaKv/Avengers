package com.sruj.encapsulation.internal;
public class Tank {
    private String model = "T-90";
    private int armorLevel = 100;
    private boolean isOperational = true;
    private double fuelCapacity = 500.0;
    private String originCountry = "Russia";

    void setModel(String model) {
        this.model = model;
    }

    void setArmorLevel(int armorLevel) {
        this.armorLevel = armorLevel;
    }

    void setOperational(boolean isOperational) {
        this.isOperational = isOperational;
    }

    void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getModel() {
        return model;
    }

    public int getArmorLevel() {
        return armorLevel;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public String getOriginCountry() {
        return originCountry;
    }
}
