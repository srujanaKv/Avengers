package com.in.runner;

import com.in.external.TechSolutions;
import com.in.internal.SoftwareCompany;

public class SoftwareCompanyRunner {
    public static void main(String[] args) {
        SoftwareCompany company = new TechSolutions();
        TechSolutions tech = new TechSolutions();

        company.developSoftware();
        company.testSoftware();
        company.deploySoftware();
        company.conductMeetings();
        company.reviewCode();
        company.manageProjects();
        company.interactWithClients();
        company.provideSupport();
        company.trainEmployees();

        tech.developSoftware();
        tech.testSoftware();
        tech.deploySoftware();
        tech.conductMeetings();
        tech.reviewCode();
        tech.manageProjects();
        tech.interactWithClients();
        tech.provideSupport();
        tech.trainEmployees();
    }
}
