package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.*;

public class SmartHomeManager implements Appliance, Bakery, BankRule, BarberRule, Bed {


    @Override
    public void switchOn() {
        System.out.println("SmartHomeManager switchOn is important");
    }

    @Override
    public void switchOff() {
        System.out.println("SmartHomeManager switchOff is important");

    }

    @Override
    public void getStatus() {
        System.out.println("SmartHomeManager getStatus is important");

    }

    @Override
    public void bakeCake() {
        System.out.println("SmartHomeManager bakeCake is important");

    }

    @Override
    public void bakeBread() {
        System.out.println("SmartHomeManager bakeBread is important");

    }

    @Override
    public void makePastry() {
        System.out.println("SmartHomeManager makePastry is important");

    }

    @Override
    public void open() {
        System.out.println("SmartHomeManager open is important");

    }

    @Override
    public void close() {
        System.out.println("SmartHomeManager close is important");

    }

    @Override
    public void deposit() {
        System.out.println("SmartHomeManager deposit is important");

    }

    @Override
    public void barberSafety() {
        System.out.println("SmartHomeManager barberSafety is important");

    }

    @Override
    public void barberTools() {
        System.out.println("SmartHomeManager barberTools is important");

    }

    @Override
    public void barberHygiene() {
        System.out.println("SmartHomeManager barberHygiene is important");

    }

    @Override
    public void sleep() {
        System.out.println("SmartHomeManager sleep is important");

    }

    @Override
    public void takeNap() {
        System.out.println("SmartHomeManager takeNap is important");

    }

    @Override
    public void relax() {
        System.out.println("SmartHomeManager relax is important");

    }
}
