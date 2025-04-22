package com.in.runner;

import com.in.external.InternationalAirport;
import com.in.internal.Airport;

public class AirportRunner {
    public static void main(String[] args) {
        Airport airport = new InternationalAirport();
        InternationalAirport internationalAirport = new InternationalAirport();

        airport.checkIn();
        airport.securityCheck();
        airport.boarding();
        airport.announceFlight();
        airport.handleBaggage();

        internationalAirport.checkIn();
        internationalAirport.securityCheck();
        internationalAirport.boarding();
        internationalAirport.announceFlight();
        internationalAirport.handleBaggage();
    }
}
