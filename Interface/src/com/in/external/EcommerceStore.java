package com.in.external;

import com.in.internal.OnlineStore;

public class EcommerceStore implements OnlineStore {
    @Override
    public void browseProducts() {
        System.out.println("Browsing products on EcommerceStore");
    }

    @Override
    public void addToCart() {
        System.out.println("Adding products to cart on EcommerceStore");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment on EcommerceStore");
    }

    @Override
    public void shipOrder() {
        System.out.println("Shipping order from EcommerceStore");
    }

    @Override
    public void returnOrder() {
        System.out.println("Returning order on EcommerceStore");
    }
}
