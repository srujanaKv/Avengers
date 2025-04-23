package com.in.external;

import com.in.internal.PoliceStation;

public class CityPoliceStation implements PoliceStation {
    @Override
    public void fileComplaint() {
        System.out.println("Filing complaint at City Police Station");
    }

    @Override
    public void investigateCase() {
        System.out.println("Investigating case at City Police Station");
    }

    @Override
    public void arrestSuspect() {
        System.out.println("Arresting suspect from City Police Station");
    }

    @Override
    public void conductPatrol() {
        System.out.println("Conducting patrol from City Police Station");
    }

    @Override
    public void handleTraffic() {
        System.out.println("Handling traffic by City Police Station");
    }

    @Override
    public void provideSecurity() {
        System.out.println("Providing security by City Police Station");
    }

    @Override
    public void closeCase() {
        System.out.println("Closing case at City Police Station");
    }
}

