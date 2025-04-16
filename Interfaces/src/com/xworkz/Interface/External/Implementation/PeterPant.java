package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Pant;

public class PeterPant implements Pant {
    @Override
    public void wearPant() {
        System.out.println("Wearing Peter Pant");
    }

    @Override
    public void washPant() {
        System.out.println("Washing Peter Pant");
    }

    @Override
    public void foldPant() {
        System.out.println("Folding Peter Pant");
    }


}
