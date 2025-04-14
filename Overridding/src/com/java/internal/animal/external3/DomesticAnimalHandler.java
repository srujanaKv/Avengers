package com.java.internal.animal.external3;

import com.java.internal.animal.internal3.Animal;
import com.java.internal.animal.internal3.Domestic;

public class DomesticAnimalHandler {

    public void handle(Animal animal) {
        if (animal != null) {
            animal.Lion();

            if (animal instanceof Domestic) {
                Domestic domestic = (Domestic) animal;
                domestic.Dog();
            } else {
                System.err.println("This is not a domestic animal");
            }
        } else {
            System.err.println("Animal is null");
        }
    }
}