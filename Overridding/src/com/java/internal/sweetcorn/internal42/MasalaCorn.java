package com.java.internal.sweetcorn.internal42;

public class MasalaCorn extends Sweetcorn {
    @Override
    public void Roast() {
        System.out.println("running roast");
    }

    public void Spice() {
        System.out.println("running spice in masala corn");
        super.Roast();
    }
}
