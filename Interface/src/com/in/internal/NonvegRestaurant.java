package com.in.internal;

public interface NonvegRestaurant extends Restaurant,VegRestaurant {
    @Override
    void TakeOrder();

    @Override
    void Takebill();
}
