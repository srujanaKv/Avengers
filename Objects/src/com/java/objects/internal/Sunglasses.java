package com.java.objects.internal;

import java.util.Objects;

public class Sunglasses {
    private String brand;
    private String frameColor;
    private String lensType;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sunglasses) {
            Sunglasses sg = (Sunglasses) obj;
            if (Objects.equals(this.brand, sg.brand) &&
                    Objects.equals(this.frameColor, sg.frameColor) &&
                    Objects.equals(this.lensType, sg.lensType) &&
                    Objects.equals(this.price, sg.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Sunglasses");
        return "Brand=" + brand + ", FrameColor=" + frameColor + ", LensType=" + lensType + ", Price=" + price;
    }
}
