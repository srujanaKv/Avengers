package com.in.runner;

import com.in.external.CityLibrary;
import com.in.internal.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library = new CityLibrary();
        CityLibrary cityLibrary = new CityLibrary();


        library.issueBook();
        library.returnBook();
        library.payFine();

        cityLibrary.issueBook();
        cityLibrary.returnBook();
        cityLibrary.payFine();
    }
}
