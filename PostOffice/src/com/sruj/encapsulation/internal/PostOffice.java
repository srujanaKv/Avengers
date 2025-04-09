package com.sruj.encapsulation.internal;
public class PostOffice {
    private String name = "General Post Office";
    private String location = "Delhi";
    private int numberOfEmployees = 50;
    private boolean isAutomated = false;
    private double annualRevenue = 1.5;


    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    void setAutomated(boolean isAutomated) {
        this.isAutomated = isAutomated;
    }

    void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public boolean isAutomated() {
        return isAutomated;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }
}