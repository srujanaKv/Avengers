package com.java.objects.internal;

import java.util.Objects;

public class Dog {
    private String breed;
    private String color;
    private int age;
    private boolean isTrained;

    public Dog(String breed, String color, int age, boolean isTrained) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.isTrained = isTrained;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Dog) {
            Dog dog = (Dog) obj;
            if (Objects.equals(this.breed, dog.breed) && Objects.equals(this.color, dog.color)) {
                System.out.println("Dog is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dog[breed:" + breed + ", color:" + color + ", age:" + age + " years, isTrained:" + isTrained + "]";
    }
}
