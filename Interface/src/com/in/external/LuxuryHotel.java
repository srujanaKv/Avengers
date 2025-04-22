package com.in.external;

import com.in.internal.Hotel;

public class LuxuryHotel implements Hotel {
    @Override
    public void bookRoom() {
        System.out.println("Booking room in LuxuryHotel");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food in LuxuryHotel");
    }

    @Override
    public void checkout() {
        System.out.println("Checkout from LuxuryHotel");
    }
}
