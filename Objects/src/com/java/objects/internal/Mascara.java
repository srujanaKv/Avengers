package com.java.objects.internal;

import java.util.Objects;

public class Mascara {
    private String brand;
    private String type;
    private int price;
    private boolean waterproof;

    public Mascara(String brand, String type, int price, boolean waterproof) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.waterproof = waterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mascara) {
            Mascara mascara = (Mascara) obj;
            if (Objects.equals(this.brand, mascara.brand) && Objects.equals(this.type, mascara.type)) {
                System.out.println("Mascara is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mascara[brand:" + brand + ", type:" + type + ", price:" + price + ", waterproof:" + waterproof + "]";
    }
}

