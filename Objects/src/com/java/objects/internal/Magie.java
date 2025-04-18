package com.java.objects.internal;

import java.util.Objects;

public class Magie {
    private String spellName;
    private String element;
    private int powerLevel;
    private boolean isDarkMagic;

    public Magie(String spellName, String element, int powerLevel, boolean isDarkMagic) {
        this.spellName = spellName;
        this.element = element;
        this.powerLevel = powerLevel;
        this.isDarkMagic = isDarkMagic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Magie) {
            Magie magie = (Magie) obj;
            if (Objects.equals(this.spellName, magie.spellName) && Objects.equals(this.element, magie.element)) {
                System.out.println("Magie is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Magie[spellName:" + spellName + ", element:" + element + ", powerLevel:" + powerLevel + ", isDarkMagic:" + isDarkMagic + "]";
    }
}

