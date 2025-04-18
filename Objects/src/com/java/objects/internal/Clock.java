package com.java.objects.internal;

import java.util.Objects;

public class Clock {
    private String type;
    private String color;
    private int hour;
    private int minute;

    public Clock(String type, String color, int hour, int minute) {
        this.type = type;
        this.color = color;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Clock) {
            Clock clock = (Clock) obj;
            if (Objects.equals(this.type, clock.type) && Objects.equals(this.color, clock.color)
                    && this.hour == clock.hour && this.minute == clock.minute) {
                System.out.println("Clock is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Clock[type:" + type + ", color:" + color + ", time:" + hour + ":" + minute + "]";
    }
}
