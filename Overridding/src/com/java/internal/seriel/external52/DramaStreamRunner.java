package com.java.internal.seriel.external52;

import com.java.internal.seriel.internal52.Seriel;
import com.java.internal.seriel.internal52.DramaSeriel;

public class DramaStreamRunner {

    public void action(Seriel seriel) {
        if (seriel != null) {
            seriel.Stream();
            if (seriel instanceof DramaSeriel) {
                DramaSeriel drama = (DramaSeriel) seriel;
                drama.Episode();
            }
        } else {
            System.out.println("No seriel to act upon.");
        }
    }

}