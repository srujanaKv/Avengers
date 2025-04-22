package com.in.external;

import com.in.internal.NonvegRestaurant;

public class Millitary implements NonvegRestaurant {
    @Override
    public void Takebill() {
        System.out.println("millitary hotel is taking bill");
    }

    @Override
    public void TakeOrder() {
        System.out.println("millitary is taking order");
    }
}
