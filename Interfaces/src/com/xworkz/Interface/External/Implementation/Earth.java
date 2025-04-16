package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Planet;

public class Earth implements Planet {
    @Override
    public void planetType() {
        System.out.println("Earth is a terrestrial planet.");
    }

    @Override
    public void planetColor() {
        System.out.println("Earth appears blue and green from space.");
    }

    @Override
    public void planetPrice() {
        System.out.println("Earth is priceless.");
    }
}
