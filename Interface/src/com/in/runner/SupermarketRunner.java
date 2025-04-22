package com.in.runner;

import com.in.external.BigBazaar;
import com.in.internal.Supermarket;

public class SupermarketRunner {
    public static void main(String[] args) {
        Supermarket market = new BigBazaar();       // Interface type
        BigBazaar bigBazaar = new BigBazaar();      // Implementation class type

        market.openStore();
        market.stockShelves();
        market.assistCustomers();
        market.processBilling();
        market.closeStore();

        bigBazaar.openStore();
        bigBazaar.stockShelves();
        bigBazaar.assistCustomers();
        bigBazaar.processBilling();
        bigBazaar.closeStore();
    }
}
