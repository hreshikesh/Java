package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Appliance;
import com.xworkz.isarelation.Internal.WashingMachine;

public class Wash {
    public void clothWash(Appliance appliance){
        appliance.turnOn();
        appliance.turnOff();
        appliance.consumeElectricity();
        appliance.maintain();
        appliance.warrantyPeriod();

        if(appliance instanceof WashingMachine){
            System.out.println("inWashing Machine");
            WashingMachine washingMachine=(WashingMachine) appliance;
            washingMachine.machineCost();
        }
    }
}
