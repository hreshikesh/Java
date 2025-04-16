package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Bicycle;

public class HeroCycle implements Bicycle {
    @Override
    public void pedal() {
        System.out.println("Pedaling the Hero cycle");
    }

    @Override
    public void brake() {
        System.out.println("Applying brakes on the Hero cycle");
    }

    @Override
    public void ringBell() {
        System.out.println("Ringing the bell of the Hero cycle");
    }
}
