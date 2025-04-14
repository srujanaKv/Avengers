package com.java.internal.besheet.external69;

import com.java.internal.besheet.internal69.Bedsheet;
import com.java.internal.besheet.internal69.CottonSheet;

public class BedsheetHandler {

    public void handle(Bedsheet bedsheet) {
        if (bedsheet != null) {
            bedsheet.Spread();
            if (bedsheet instanceof CottonSheet) {
                CottonSheet cotton = (CottonSheet) bedsheet;
                cotton.Fold();
            } else {
                System.err.println("This is not a cotton sheet");
            }
        } else {
            System.err.println("Bedsheet is null");
        }
    }
}
