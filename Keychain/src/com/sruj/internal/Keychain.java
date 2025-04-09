package com.sruj.internal;

public class Keychain {
    private String material = "Leather";
    private int numberOfKeys = 3;
    private boolean hasGPS = false;
    private double weight = 0.15;
    private String brand = "KeyMaster";


    void setMaterial(String material) {
        this.material = material;
    }

    void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

        public String getMaterial() {
        return material;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public double getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }
}

