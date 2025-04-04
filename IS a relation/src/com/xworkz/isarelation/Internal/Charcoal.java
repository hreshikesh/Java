package com.xworkz.isarelation.Internal;

public class Charcoal extends Coal{
    public Charcoal() {
        System.out.println("Running no-arg constructor of Charcoal");
    }
    @Override
    public void burn() {
        System.out.println("Coal is used as a fuel for burning in subclass");
    }
    @Override
    public void generateEnergy() {
        System.out.println("Coal is used to generate electricity and heat in subclass");
    }
    @Override
    public void carbonContent() {
        System.out.println("Coal contains high carbon content in subclass");
    }
    @Override
    public void extraction() {
        System.out.println("Coal is extracted from mines in subclass");
    }
    @Override
    public void usage() {
        System.out.println("Coal is used in industries in subclass");
    }
}
