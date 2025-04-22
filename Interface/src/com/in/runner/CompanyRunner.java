package com.in.runner;

import com.in.external.DressCode;
import com.in.internal.Company;

public class CompanyRunner {

    public static void main(String[] args) {


        Company company=new DressCode();
        DressCode dressCode=new DressCode();


        company.Login();
        company.Logout();
        company.attendence();

        dressCode.Login();
        dressCode.Logout();
        dressCode.attendence();
    }
}
