package com.in.runner;

import com.in.external.BrewBuzz;
import com.in.internal.CoffeeShop;

public class CoffeeShopRunner {
    public static void main(String[] args) {
        CoffeeShop shop = new BrewBuzz();
        BrewBuzz buzz = new BrewBuzz();

        shop.openShop();
        shop.takeOrders();
        shop.prepareCoffee();
        shop.serveCustomers();
        shop.cleanTables();
        shop.restockSupplies();
        shop.manageBilling();
        shop.playMusic();
        shop.closeShop();

        buzz.openShop();
        buzz.takeOrders();
        buzz.prepareCoffee();
        buzz.serveCustomers();
        buzz.cleanTables();
        buzz.restockSupplies();
        buzz.manageBilling();
        buzz.playMusic();
        buzz.closeShop();
    }
}
