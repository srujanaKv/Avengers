package com.in.external;

import com.in.internal.Airport;

public class InternationalAirport implements Airport {
    @Override
    public void checkIn() {
        System.out.println("Check-in at InternationalAirport");
    }

    @Override
    public void securityCheck() {
        System.out.println("Security check at InternationalAirport");
    }

    @Override
    public void boarding() {
        System.out.println("Boarding passengers at InternationalAirport");
    }

    @Override
    public void announceFlight() {
        System.out.println("Announcing flight at InternationalAirport");
    }

    @Override
    public void handleBaggage() {
        System.out.println("Handling baggage at InternationalAirport");
    }
}
