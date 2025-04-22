package com.in.external;

import com.in.internal.Library;

public class CityLibrary implements Library {
    @Override
    public void issueBook() {
        System.out.println("Issuing book from CityLibrary");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning book to CityLibrary");
    }

    @Override
    public void payFine() {
        System.out.println("Paying fine at CityLibrary");
    }
}
