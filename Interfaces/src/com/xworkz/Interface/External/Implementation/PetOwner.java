package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.PetRule;

public class PetOwner implements PetRule {
    @Override
    public void feed() {
        System.out.println("Feeding the pet");
    }

    @Override
    public void walk() {
        System.out.println("Walking the pet");
    }

    @Override
    public void groom() {
        System.out.println("Grooming the pet");
    }
}
