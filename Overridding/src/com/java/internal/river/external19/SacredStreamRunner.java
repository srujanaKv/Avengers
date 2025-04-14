package com.java.internal.river.external19;

import com.java.internal.river.internal19.River;
import com.java.internal.river.internal19.Ganga;

public class SacredStreamRunner {

    public void observeRiver(River river) {
        if (river != null) {
            river.Flow();
            if (river instanceof Ganga) {
                Ganga ganga = (Ganga) river;
                ganga.Purity();
            }
        } else {
            System.out.println("No river to observe.");
        }
    }
}
