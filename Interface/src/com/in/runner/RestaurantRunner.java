package com.in.runner;

import com.in.external.Millitary;
import com.in.internal.NonvegRestaurant;


public class RestaurantRunner {
    public static void main(String[] args) {

        NonvegRestaurant nonvegRestaurant=new Millitary();
        Millitary millitary=new Millitary();

        nonvegRestaurant.Takebill();
        nonvegRestaurant.TakeOrder();

        millitary.Takebill();
        millitary.TakeOrder();

    }
}
