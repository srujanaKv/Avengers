package com.in.runner;

import com.in.external.FitnessGym;
import com.in.internal.Gym;

public class GymRunner {
    public static void main(String[] args) {
        Gym gym = new FitnessGym();      // Using interface type
        FitnessGym fitnessGym = new FitnessGym(); // Using implementation class type

        gym.startWorkout();
        gym.giveTraining();
        gym.provideEquipment();
        gym.organizeClasses();
        gym.offerMembership();

        fitnessGym.startWorkout();
        fitnessGym.giveTraining();
        fitnessGym.provideEquipment();
        fitnessGym.organizeClasses();
        fitnessGym.offerMembership();
    }
}
