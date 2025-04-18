package com.java.objects.internal;

import java.util.Objects;

public class Cloud {
    private String type;
    private String color;
    private int altitude;
    private boolean isRaining;

    public Cloud(String type, String color, int altitude, boolean isRaining) {
        this.type = type;
        this.color = color;
        this.altitude = altitude;
        this.isRaining = isRaining;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cloud) {
            Cloud cloud = (Cloud) obj;
            if (Objects.equals(this.type, cloud.type) && Objects.equals(this.color, cloud.color)) {
                System.out.println("Cloud is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cloud[type:" + type + ", color:" + color + ", altitude:" + altitude + ", isRaining:" + isRaining + "]";
    }
}
