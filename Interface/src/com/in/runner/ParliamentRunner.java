package com.in.runner;

import com.in.external.IndianParliament;
import com.in.internal.Parliament;

public class ParliamentRunner {
    public static void main(String[] args) {
        Parliament parliament = new IndianParliament();
        IndianParliament indianParliament = new IndianParliament();

        parliament.conductSession();
        parliament.passBill();
        parliament.debatePolicy();
        parliament.questionMinisters();
        parliament.approveBudget();
        parliament.meetCommittees();
        parliament.adjournHouse();

        indianParliament.conductSession();
        indianParliament.passBill();
        indianParliament.debatePolicy();
        indianParliament.questionMinisters();
        indianParliament.approveBudget();
        indianParliament.meetCommittees();
        indianParliament.adjournHouse();
    }
}
