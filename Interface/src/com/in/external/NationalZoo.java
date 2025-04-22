package com.in.external;

import com.in.internal.Zoo;

public class NationalZoo implements Zoo {
    @Override
    public void openGates() {
        System.out.println("Opening gates of NationalZoo");
    }

    @Override
    public void feedAnimals() {
        System.out.println("Feeding animals in NationalZoo");
    }

    @Override
    public void conductSafari() {
        System.out.println("Conducting safari in NationalZoo");
    }

    @Override
    public void cleanEnclosures() {
        System.out.println("Cleaning animal enclosures in NationalZoo");
    }

    @Override
    public void closeZoo() {
        System.out.println("Closing the gates of NationalZoo");
    }
}
