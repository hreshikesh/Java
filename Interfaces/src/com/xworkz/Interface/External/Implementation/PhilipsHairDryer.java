package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.HairDryer;

public class PhilipsHairDryer implements HairDryer {
    @Override
    public void startDrying() {
        System.out.println("Philips Hair Dryer is starting to dry hair.");
    }

    @Override
    public void stopDrying() {
        System.out.println("Philips Hair Dryer has stopped drying hair.");
    }

    @Override
    public void adjustHeatLevel() {
        System.out.println("Adjusting heat level on Philips Hair Dryer.");
    }
}
