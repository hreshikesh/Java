package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.CleaningRules;

public class Vaccum implements CleaningRules {

    @Override
    public void sweep() {
        System.out.println("Vaccum is sweeping");
    }

    @Override
    public void mop() {
        System.out.println("Vaccum is mopping");
    }

    @Override
    public void dust() {
        System.out.println("Vaccum is dusting");
    }
}
