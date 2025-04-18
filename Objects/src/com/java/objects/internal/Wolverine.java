package com.java.objects.internal;

import java.util.Objects;

public class Wolverine {
    private String codeName;
    private String metalType;
    private int healingFactor;
    private boolean hasClaws;

    public Wolverine(String codeName, String metalType, int healingFactor, boolean hasClaws) {
        this.codeName = codeName;
        this.metalType = metalType;
        this.healingFactor = healingFactor;
        this.hasClaws = hasClaws;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Wolverine) {
            Wolverine wolverine = (Wolverine) obj;
            if (Objects.equals(this.codeName, wolverine.codeName) && Objects.equals(this.metalType, wolverine.metalType)) {
                System.out.println("Wolverine is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Wolverine[codeName:" + codeName + ", metalType:" + metalType + ", healingFactor:" + healingFactor + ", hasClaws:" + hasClaws + "]";
    }
}
