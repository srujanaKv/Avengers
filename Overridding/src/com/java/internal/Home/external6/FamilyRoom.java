package com.java.internal.home.external6;

import com.java.internal.home.internal6.Home;
import com.java.internal.home.internal6.Member;

public class FamilyRoom {

    public void gather(Home home) {
        if (home != null) {
            home.Family();
            if (home instanceof Member) {
                Member member = (Member) home;
                member.Bond();
            }
        } else {
            System.out.println("No family to gather.");
        }
    }
}