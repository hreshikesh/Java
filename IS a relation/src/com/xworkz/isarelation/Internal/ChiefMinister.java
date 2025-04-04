package com.xworkz.isarelation.Internal;

public class ChiefMinister extends Minister{
    public ChiefMinister() {
        System.out.println("Running no-arg constructor of Chief Minister");

    }
    @Override
    public void makePolicies() {
        System.out.println("Minister is making policies in subclass");
    }
    @Override
    public void implementLaws() {
        System.out.println("Minister is implementing laws in subclass");
    }
    @Override
    public void attendMeetings() {
        System.out.println("Minister is attending meetings in subclass");
    }
    @Override
    public void representGovernment() {
        System.out.println("Minister represents the government in subclass");
    }
    @Override
    public void manageDepartment() {
        System.out.println("Minister is managing their respective dept in subclass");
    }
}
