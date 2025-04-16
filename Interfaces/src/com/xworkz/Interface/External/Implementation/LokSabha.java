package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Parliment;

public class LokSabha implements Parliment {
    @Override
    public void fight() {
        System.out.println("LokSabha fight is important");
    }

    @Override
    public void debate() {
        System.out.println("LokSabha debate is important");
    }

    @Override
    public void discuss() {
        System.out.println("LokSabha discuss is important");
    }
}
