package com.sruj.external;

import com.sruj.internal.Keychain;

public class KeychainResearch {
    public void studyKeychain() {
        Keychain keychain = new Keychain();

        System.out.println("Studying Keychain:");
        System.out.println("Material: " + keychain.getMaterial());
        System.out.println("Number of Keys: " + keychain.getNumberOfKeys());
        System.out.println("Has GPS: " + keychain.isHasGPS());
        System.out.println("Weight: " + keychain.getWeight() + " kg");
        System.out.println("Brand: " + keychain.getBrand());
    }
}

