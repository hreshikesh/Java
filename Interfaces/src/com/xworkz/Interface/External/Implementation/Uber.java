package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.TaxiRule;

public class Uber implements TaxiRule {
    @Override
    public void taxiFare() {
        System.out.println("Taxi fare is available");
    }

    @Override
    public void taxiBooking() {
        System.out.println("Taxi booking is available");
    }

    @Override
    public void taxiDriver() {
        System.out.println("Taxi driver is available");
    }
}
