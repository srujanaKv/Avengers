package com.in.external;

import com.in.internal.Gym;

public class FitnessGym implements Gym {
    @Override
    public void startWorkout() {
        System.out.println("Starting workout at FitnessGym");
    }

    @Override
    public void giveTraining() {
        System.out.println("Providing training at FitnessGym");
    }

    @Override
    public void provideEquipment() {
        System.out.println("Providing equipment at FitnessGym");
    }

    @Override
    public void organizeClasses() {
        System.out.println("Organizing fitness classes at FitnessGym");
    }

    @Override
    public void offerMembership() {
        System.out.println("Offering membership at FitnessGym");
    }
}

