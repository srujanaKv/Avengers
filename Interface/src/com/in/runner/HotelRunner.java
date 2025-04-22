package com.in.runner;

import com.in.external.LuxuryHotel;
import com.in.internal.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new LuxuryHotel();
        LuxuryHotel luxuryHotel = new LuxuryHotel();

        hotel.bookRoom();
        hotel.serveFood();
        hotel.checkout();

        luxuryHotel.bookRoom();
        luxuryHotel.serveFood();
        luxuryHotel.checkout();
    }
}
