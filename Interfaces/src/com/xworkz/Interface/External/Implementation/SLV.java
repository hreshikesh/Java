package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Rocket;

public class SLV implements Rocket {
    @Override
    public void launchRocket() {
        System.out.println("Launching SLV Rocket");
    }

    @Override
    public void landRocket() {
        System.out.println("Landing SLV Rocket");
    }

    @Override
    public void rocketSpeed() {
        System.out.println("SLV Rocket Speed");
    }
}
