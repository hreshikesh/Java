package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Appliance;


public class Fridge implements Appliance {
    @Override
    public void switchOn() {
        System.out.println("Fridge is switched on");
    }

    @Override
    public void switchOff() {
        System.out.println("Fridge is switched off");
    }

    @Override
    public void getStatus() {
        System.out.println("Fridge is running");
    }


}
