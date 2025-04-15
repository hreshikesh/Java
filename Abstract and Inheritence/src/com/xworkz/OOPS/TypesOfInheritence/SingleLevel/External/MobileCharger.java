package com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.Charger;

public class MobileCharger extends Charger {
    @Override
    public void charge() {
        System.out.println("Running Charger in MobileChargerss");
    }
}
