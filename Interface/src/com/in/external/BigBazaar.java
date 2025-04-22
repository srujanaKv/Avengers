package com.in.external;

import com.in.internal.Supermarket;

public class BigBazaar implements Supermarket {
    @Override
    public void openStore() {
        System.out.println("Opening BigBazaar supermarket");
    }

    @Override
    public void stockShelves() {
        System.out.println("Stocking shelves at BigBazaar");
    }

    @Override
    public void assistCustomers() {
        System.out.println("Assisting customers at BigBazaar");
    }

    @Override
    public void processBilling() {
        System.out.println("Processing billing at BigBazaar");
    }

    @Override
    public void closeStore() {
        System.out.println("Closing BigBazaar supermarket");
    }
}
