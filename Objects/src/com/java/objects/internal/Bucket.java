package com.java.objects.internal;

import java.util.Objects;

public class Bucket {
    private String material;
    private String color;
    private int capacity;
    private boolean isHandlePresent;

    public Bucket(String material, String color, int capacity, boolean isHandlePresent) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.isHandlePresent = isHandlePresent;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bucket) {
            Bucket bucket = (Bucket) obj;
            if (Objects.equals(this.material, bucket.material) && Objects.equals(this.color, bucket.color)
                    && this.capacity == bucket.capacity && this.isHandlePresent == bucket.isHandlePresent) {
                System.out.println("Bucket is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bucket[material:" + material + ", color:" + color + ", capacity:" + capacity + "L, isHandlePresent:" + isHandlePresent + "]";
    }
}
