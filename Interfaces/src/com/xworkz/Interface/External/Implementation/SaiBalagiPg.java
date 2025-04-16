package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.PgRules;

public class SaiBalagiPg implements PgRules {
    @Override
    public void checkIn() {
        System.out.println("Checking in to Sai Balagi PG");
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out of Sai Balagi PG");
    }

    @Override
    public void payRent() {
        System.out.println("Paying rent for Sai Balagi PG");
    }
}
