package com.java.objects.internal;

import java.util.Objects;

public class Horse {
    private String breed;
    private String color;
    private int age;
    private boolean isTrainedForRacing;

    public Horse(String breed, String color, int age, boolean isTrainedForRacing) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.isTrainedForRacing = isTrainedForRacing;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Horse) {
            Horse horse = (Horse) obj;
            if (Objects.equals(this.breed, horse.breed) && Objects.equals(this.color, horse.color)) {
                System.out.println("Horse is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Horse[breed:" + breed + ", color:" + color + ", age:" + age + " years, isTrainedForRacing:" + isTrainedForRacing + "]";
    }
}
