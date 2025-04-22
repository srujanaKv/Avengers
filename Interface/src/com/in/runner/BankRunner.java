package com.in.runner;

import com.in.external.SBI;
import com.in.internal.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new SBI();
        SBI sbi = new SBI();

        bank.openAccount();
        bank.closeAccount();
        bank.loanService();

        sbi.openAccount();
        sbi.closeAccount();
        sbi.loanService();
    }
}

