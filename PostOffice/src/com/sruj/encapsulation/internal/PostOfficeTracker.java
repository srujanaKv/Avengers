package com.sruj.encapsulation.internal;

public class PostOfficeTracker {
    public void trackPostOffice() {
        PostOffice po = new PostOffice();

        System.out.println("Initial Post Office Details:");
        System.out.println("Name: " + po.getName());
        System.out.println("Location: " + po.getLocation());
        System.out.println("Employees: " + po.getNumberOfEmployees());
        System.out.println("Automated: " + po.isAutomated());
        System.out.println("Annual Revenue: " + po.getAnnualRevenue() + " crore");

        po.setName("Tech Park PO");
        po.setLocation("Bangalore");
        po.setNumberOfEmployees(75);
        po.setAutomated(true);
        po.setAnnualRevenue(3.8);

        System.out.println("\nUpdated Post Office Details:");
        System.out.println("Name: " + po.getName());
        System.out.println("Location: " + po.getLocation());
        System.out.println("Employees: " + po.getNumberOfEmployees());
        System.out.println("Automated: " + po.isAutomated());
        System.out.println("Annual Revenue: " + po.getAnnualRevenue() + " crore");
    }
}

