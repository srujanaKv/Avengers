package com.in.runner;

import com.in.external.EcommerceStore;
import com.in.internal.OnlineStore;

public class OnlineStoreRunner {
    public static void main(String[] args) {
        OnlineStore store = new EcommerceStore();       // Using interface type
        EcommerceStore ecommerceStore = new EcommerceStore(); // Implementation class type

        store.browseProducts();
        store.addToCart();
        store.processPayment();
        store.shipOrder();
        store.returnOrder();

        ecommerceStore.browseProducts();
        ecommerceStore.addToCart();
        ecommerceStore.processPayment();
        ecommerceStore.shipOrder();
        ecommerceStore.returnOrder();
    }
}
