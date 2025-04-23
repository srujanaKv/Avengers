package com.in.external;

import com.in.internal.FireStation;

public class CityFireStation implements FireStation {
    @Override
    public void receiveEmergencyCall() {
        System.out.println("Receiving emergency call at City Fire Station");
    }

    @Override
    public void dispatchFireTruck() {
        System.out.println("Dispatching fire truck from City Fire Station");
    }

    @Override
    public void rescuePeople() {
        System.out.println("Rescuing people by City Fire Station");
    }

    @Override
    public void extinguishFire() {
        System.out.println("Extinguishing fire by City Fire Station");
    }

    @Override
    public void refillEquipment() {
        System.out.println("Refilling equipment at City Fire Station");
    }

    @Override
    public void conductDrill() {
        System.out.println("Conducting safety drill at City Fire Station");
    }

    @Override
    public void reportIncident() {
        System.out.println("Reporting incident at City Fire Station");
    }
}
