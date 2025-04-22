package com.in.external;

import com.in.internal.Election;

public class IdentityProof implements Election {

    @Override
    public void Age() {
        System.out.println("Age is running in IdentityProof");
    }
}
