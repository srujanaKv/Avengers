package com.in.external;

import com.in.internal.Company;

public class DressCode implements Company {

    @Override
    public void Login() {
        System.out.println("Login is running in DressCode");
    }

    @Override
    public void Logout() {
        System.out.println("Logout is running in DressCode");

    }

    @Override
    public void attendence() {
        System.out.println("attendence is running in DressCode");

    }
}
