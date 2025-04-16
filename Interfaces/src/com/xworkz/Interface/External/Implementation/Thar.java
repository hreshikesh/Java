package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.OffRoad;

public class Thar implements OffRoad {
    @Override
    public void drive() {
        System.out.println("Driving the Thar");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up the Thar");

    }

    @Override
    public void driveOnRoughTerrain() {
        System.out.println("Driving the Thar on rough terrain");

    }
}
