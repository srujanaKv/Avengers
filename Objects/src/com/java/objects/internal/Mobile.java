package com.java.objects.internal;

import java.util.Objects;

public class Mobile {
    private String brand;
    private String model;
    private int storage;
    private boolean is5GEnabled;

    public Mobile(String brand, String model, int storage, boolean is5GEnabled) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.is5GEnabled = is5GEnabled;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mobile) {
            Mobile mobile = (Mobile) obj;
            if (Objects.equals(this.brand, mobile.brand) && Objects.equals(this.model, mobile.model)) {
                System.out.println("Mobile is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mobile[brand:" + brand + ", model:" + model + ", storage:" + storage + "GB, is5GEnabled:" + is5GEnabled + "]";
    }
}

