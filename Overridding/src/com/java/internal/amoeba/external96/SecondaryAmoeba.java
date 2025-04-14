package com.java.internal.amoeba.external96;

import com.java.internal.amoeba.internal96.Amoeba;
import com.java.internal.amoeba.internal96.BinaryAmoeba;

public class SecondaryAmoeba {
    public void process(Amoeba amoeba){
        if(amoeba!=null){
            amoeba.Reproduce();
            if(amoeba instanceof BinaryAmoeba) {
                BinaryAmoeba binaryAmoeba = (BinaryAmoeba) amoeba;
                binaryAmoeba.Split();
            }else{
                System.err.println("this is not a binary amoeba");
            }
        }
        else{
            System.err.println("amoeba is null");
        }
    }
}
