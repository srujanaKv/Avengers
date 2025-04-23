package com.in.external;

import com.in.internal.Parliament;

public class IndianParliament implements Parliament {
    @Override
    public void conductSession() {
        System.out.println("Conducting parliamentary session in Indian Parliament");
    }

    @Override
    public void passBill() {
        System.out.println("Passing a bill in Indian Parliament");
    }

    @Override
    public void debatePolicy() {
        System.out.println("Debating policy in Indian Parliament");
    }

    @Override
    public void questionMinisters() {
        System.out.println("Questioning ministers in Indian Parliament");
    }

    @Override
    public void approveBudget() {
        System.out.println("Approving budget in Indian Parliament");
    }

    @Override
    public void meetCommittees() {
        System.out.println("Meeting parliamentary committees in Indian Parliament");
    }

    @Override
    public void adjournHouse() {
        System.out.println("Adjourning the house in Indian Parliament");
    }
}
