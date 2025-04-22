package com.in.runner;

import com.in.external.NationalZoo;
import com.in.internal.Zoo;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo zoo = new NationalZoo();
        NationalZoo nationalZoo = new NationalZoo();

        zoo.openGates();
        zoo.feedAnimals();
        zoo.conductSafari();
        zoo.cleanEnclosures();
        zoo.closeZoo();

        nationalZoo.openGates();
        nationalZoo.feedAnimals();
        nationalZoo.conductSafari();
        nationalZoo.cleanEnclosures();
        nationalZoo.closeZoo();
    }
}
