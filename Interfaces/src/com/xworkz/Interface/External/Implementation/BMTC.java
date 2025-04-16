package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.BMTCRule;

public class BMTC implements BMTCRule {
    @Override
    public void ticket() {
        System.out.println("Ticket is available");
    }

    @Override
    public void route() {
        System.out.println("Route is available");
    }

    @Override
    public void timing() {
        System.out.println("Timing is available");
    }
}
