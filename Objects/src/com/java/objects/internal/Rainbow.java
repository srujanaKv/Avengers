package com.java.objects.internal;

import java.util.Objects;

public class Rainbow {
    private String primaryColor;
    private String secondaryColor;
    private int arcLength;
    private boolean hasFullArc;

    public Rainbow(String primaryColor, String secondaryColor, int arcLength, boolean hasFullArc) {
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.arcLength = arcLength;
        this.hasFullArc = hasFullArc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rainbow) {
            Rainbow rainbow = (Rainbow) obj;
            if (Objects.equals(this.primaryColor, rainbow.primaryColor) && Objects.equals(this.secondaryColor, rainbow.secondaryColor)) {
                System.out.println("Rainbow is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rainbow[primaryColor:" + primaryColor + ", secondaryColor:" + secondaryColor + ", arcLength:" + arcLength + ", hasFullArc:" + hasFullArc + "]";
    }
}
