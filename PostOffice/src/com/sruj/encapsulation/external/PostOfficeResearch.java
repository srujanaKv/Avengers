package com.sruj.encapsulation.external;

import com.sruj.encapsulation.internal.PostOffice;

public class PostOfficeResearch {
    public void studyPostOffice() {
        PostOffice po = new PostOffice();

        System.out.println("Researching Post Office:");
        System.out.println("Name: " + po.getName());
        System.out.println("Location: " + po.getLocation());
        System.out.println("Employees: " + po.getNumberOfEmployees());
        System.out.println("Automated: " + po.isAutomated());
        System.out.println("Annual Revenue: " + po.getAnnualRevenue() + " crore");
    }
}