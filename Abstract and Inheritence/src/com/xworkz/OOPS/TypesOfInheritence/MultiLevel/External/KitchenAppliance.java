package com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.MultiLevel.Internal.Appliance;

public class KitchenAppliance extends Appliance {
    @Override
    public void grind() {
        System.out.println("Grinding in kitchenApliance");
    }

    public void mix(){
        System.out.println("mixing in kitchen Appliance");
    }
}
