package com.in.runner;

import com.in.external.CityFireStation;
import com.in.internal.FireStation;

public class FireStationRunner {
    public static void main(String[] args) {
        FireStation station = new CityFireStation();
        CityFireStation cityStation = new CityFireStation();

        station.receiveEmergencyCall();
        station.dispatchFireTruck();
        station.rescuePeople();
        station.extinguishFire();
        station.refillEquipment();
        station.conductDrill();
        station.reportIncident();

        cityStation.receiveEmergencyCall();
        cityStation.dispatchFireTruck();
        cityStation.rescuePeople();
        cityStation.extinguishFire();
        cityStation.refillEquipment();
        cityStation.conductDrill();
        cityStation.reportIncident();
    }
}
