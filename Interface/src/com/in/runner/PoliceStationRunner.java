package com.in.runner;

import com.in.external.CityPoliceStation;
import com.in.internal.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        PoliceStation station = new CityPoliceStation();
        CityPoliceStation cityStation = new CityPoliceStation();

        station.fileComplaint();
        station.investigateCase();
        station.arrestSuspect();
        station.conductPatrol();
        station.handleTraffic();
        station.provideSecurity();
        station.closeCase();

        cityStation.fileComplaint();
        cityStation.investigateCase();
        cityStation.arrestSuspect();
        cityStation.conductPatrol();
        cityStation.handleTraffic();
        cityStation.provideSecurity();
        cityStation.closeCase();
    }
}
