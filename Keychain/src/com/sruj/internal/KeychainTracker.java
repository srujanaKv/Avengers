package com.sruj.internal;

public class KeychainTracker {
    public void trackKeychain() {
        Keychain keychain = new Keychain();

        System.out.println("Initial Keychain Details:");
        System.out.println("Material: " + keychain.getMaterial());
        System.out.println("Number of Keys: " + keychain.getNumberOfKeys());
        System.out.println("Has GPS: " + keychain.isHasGPS());
        System.out.println("Weight: " + keychain.getWeight() + " kg");
        System.out.println("Brand: " + keychain.getBrand());

        // Update using setters
        keychain.setMaterial("Metal");
        keychain.setNumberOfKeys(5);
        keychain.setHasGPS(true);
        keychain.setWeight(0.25);
        keychain.setBrand("SmartKey");

        System.out.println("\nUpdated Keychain Details:");
        System.out.println("Material: " + keychain.getMaterial());
        System.out.println("Number of Keys: " + keychain.getNumberOfKeys());
        System.out.println("Has GPS: " + keychain.isHasGPS());
        System.out.println("Weight: " + keychain.getWeight() + " kg");
        System.out.println("Brand: " + keychain.getBrand());
    }
}


