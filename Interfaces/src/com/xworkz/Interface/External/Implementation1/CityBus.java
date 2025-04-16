package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.BMTCRule;
import com.xworkz.Interface.Internal.Rules.Bus;

public class CityBus implements BMTCRule, Bus {

    @Override
    public void ticket() {
        System.out.println("Ticket is important");
    }

    @Override
    public void route() {
        System.out.println("Route is important");

    }

    @Override
    public void timing() {
        System.out.println("Timing is important");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
