package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.MetroRule;

public class NammaMetro implements MetroRule {
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
