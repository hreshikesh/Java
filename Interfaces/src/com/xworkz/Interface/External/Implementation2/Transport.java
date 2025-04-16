package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.*;

public class Transport implements Bicycle, BMTCRule, Bus, MetroRule, OffRoad {
    @Override
    public void ticket() {
        System.out.println("Transport ticket is important");
    }

    @Override
    public void route() {
        System.out.println("Transport route is important");

    }

    @Override
    public void timing() {
        System.out.println("Transport timing is important");

    }

    @Override
    public void pedal() {
        System.out.println("Transport pedal is important");

    }

    @Override
    public void brake() {
        System.out.println("Transport brake is important");

    }

    @Override
    public void ringBell() {
        System.out.println("Transport ringBell is important");

    }

    @Override
    public void startEngine() {
        System.out.println("Transport startEngine is important");

    }

    @Override
    public void drive() {
        System.out.println("Transport drive is important");

    }

    @Override
    public void speedUp() {
        System.out.println("Transport speedUp is important");

    }

    @Override
    public void driveOnRoughTerrain() {

        System.out.println("Transport driveOnRoughTerrain is important");
    }

    @Override
    public void stopEngine() {
        System.out.println("Transport stopEngine is important");

    }
}
