package com.java.internal.kajal.external48;

import com.java.internal.kajal.internal48.Kajal;
import com.java.internal.kajal.internal48.BlackKajal;

public class MakeupBox {

    public void apply(Kajal k) {
        if (k != null) {
            k.Line();
            if (k instanceof BlackKajal) {
                BlackKajal black = (BlackKajal) k;
                black.Smudge();
            }
        } else {
            System.out.println("Nothing to apply.");
        }
    }}
