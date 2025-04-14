package com.java.internal.Mobile.external7;

import com.java.internal.Mobile.internal7.Mobile;
import com.java.internal.Mobile.internal7.Brand;

public class MobileTester {

    public void checkBrand(Mobile mobile) {
        if (mobile != null) {
            mobile.Samsung();
            if (mobile instanceof Brand) {
                Brand brand = (Brand) mobile;
                brand.Nothing();
            }
        } else {
            System.out.println("No mobile provided.");
        }
    }