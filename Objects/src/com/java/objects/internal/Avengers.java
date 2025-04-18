package com.java.objects.internal;

import java.util.Objects;

public class Avengers {
    private String memberName;
    private String power;
    private int strengthLevel;
    private boolean isLeader;

    public Avengers(String memberName, String power, int strengthLevel, boolean isLeader) {
        this.memberName = memberName;
        this.power = power;
        this.strengthLevel = strengthLevel;
        this.isLeader = isLeader;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Avengers) {
            Avengers avenger = (Avengers) obj;
            if (Objects.equals(this.memberName, avenger.memberName) && Objects.equals(this.power, avenger.power)) {
                System.out.println("Avenger is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Avengers[memberName:" + memberName + ", power:" + power + ", strengthLevel:" + strengthLevel + ", isLeader:" + isLeader + "]";
    }
}

