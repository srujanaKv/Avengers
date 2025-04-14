package com.java.internal.bacteria.external97;

import com.java.internal.bacteria.internal97.Bacteria;
import com.java.internal.bacteria.internal97.EColi;

public class BacteriaLab {

    public void test(Bacteria bacteria) {
        if (bacteria != null) {
            bacteria.Multiply();

            if (bacteria instanceof EColi) {
                EColi ecoli = (EColi) bacteria;
                ecoli.Infect();
            } else {
                System.err.println("This is not an E.Coli bacteria");
            }
        } else {
            System.err.println("Bacteria is null");
        }
    }
}

