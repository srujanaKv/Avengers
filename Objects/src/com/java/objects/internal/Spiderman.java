package com.java.objects.internal;

import java.util.Objects;

public class Spiderman {
    private String suitVersion;
    private String webType;
    private int agilityLevel;
    private boolean ironSuit;

    public Spiderman(String suitVersion, String webType, int agilityLevel, boolean ironSuit) {
        this.suitVersion = suitVersion;
        this.webType = webType;
        this.agilityLevel = agilityLevel;
        this.ironSuit = ironSuit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Spiderman) {
            Spiderman spidey = (Spiderman) obj;
            if (Objects.equals(this.suitVersion, spidey.suitVersion) && Objects.equals(this.webType, spidey.webType)) {
                System.out.println("Spiderman suit is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Spiderman[suitVersion:" + suitVersion + ", webType:" + webType + ", agilityLevel:" + agilityLevel + ", ironSuit:" + ironSuit + "]";
    }
}
