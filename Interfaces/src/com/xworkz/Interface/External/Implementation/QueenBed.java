package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Bed;

public class QueenBed implements Bed {
    @Override
    public void sleep() {
        System.out.println("Sleeping on the queen bed");
    }

    @Override
    public void takeNap() {
        System.out.println("Taking a nap on the queen bed");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing on the queen bed");
    }

}
