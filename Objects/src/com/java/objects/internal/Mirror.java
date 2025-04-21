package com.java.objects.internal;

import java.util.Objects;

public class Mirror {
    private String shape;
    private String frameMaterial;
    private String size;
    private double price;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mirror) {
            Mirror mirror = (Mirror) obj;
            if (Objects.equals(this.shape, mirror.shape) &&
                    Objects.equals(this.frameMaterial, mirror.frameMaterial) &&
                    Objects.equals(this.size, mirror.size) &&
                    Objects.equals(this.price, mirror.price)) {
                System.out.println("Matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        System.out.println("to String of Mirror");
        return "Shape=" + shape + ", FrameMaterial=" + frameMaterial + ", Size=" + size + ", Price=" + price;
    }
}
