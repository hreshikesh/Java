package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.GuitarRule;

public class Guitar implements GuitarRule {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the guitar");
    }

    @Override
    public void perform() {
        System.out.println("Performing with the guitar");
    }
}
