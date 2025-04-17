package com.java.internal.Tv.external10;

import com.java.internal.Tv.internal10.Tv;
import com.java.internal.Tv.internal10.Remote;

public class Tvrunner {

    public void action(Tv tv) {
        if (tv != null) {
            tv.Signal();
            if (tv instanceof Remote) {
                Remote remote = (Remote) tv;
                remote.Plug();
            }
        } else {
            System.out.println("No Tv to operate.");
        }
    }
}
