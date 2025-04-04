package com.xworkz.isarelation.Internal;

public class CopperWire extends Wire {
    public CopperWire() {
        System.out.println("Running no-arg constructor of CopperWire");
    }

    @Override
    public void conductElectricity() {
        System.out.println("Wire conducts electricity in subclass");
    }

    @Override
    public void insulation() {
        System.out.println("Wire is covered with insulating material in subclass");
    }

    @Override
    public void flexibility() {
        System.out.println("Wire can be flexible or rigid in subclass");
    }

    @Override
    public void length() {
        System.out.println("Wire is available in different lengths in subclass");
    }

    @Override
    public void usage() {
        System.out.println("Wire is used in electrical circuits and networking in subclass");
    }
}
