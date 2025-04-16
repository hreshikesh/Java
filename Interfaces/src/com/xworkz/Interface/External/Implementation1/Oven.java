package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.Appliance;
import com.xworkz.Interface.Internal.Rules.Bakery;

public class Oven implements Appliance, Bakery {

    @Override
    public void switchOn() {
        System.out.println("Oven is switched on");

    }

    @Override
    public void switchOff() {
        System.out.println("Oven is switched off");
    }

    @Override
    public void getStatus() {
        System.out.println("Oven is in good condition");
    }

    @Override
    public void bakeCake() {
        System.out.println("Oven is baking a cake");

    }

    @Override
    public void bakeBread() {
        System.out.println("Oven is baking bread");

    }

    @Override
    public void makePastry() {
        System.out.println("Oven is making pastry");

    }
}
