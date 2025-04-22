package com.in.external;

import com.in.internal.Bank;

public class SBI implements Bank {
    @Override
    public void openAccount() {
        System.out.println("Opening account in SBI");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing account in SBI");
    }

    @Override
    public void loanService() {
        System.out.println("Providing loan service in SBI");
    }
}
