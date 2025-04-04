package com.xworkz.isarelation.Internal;

public class CoconutOil extends Oil {
    public CoconutOil() {
        System.out.println("Running no-arg constructor of CoconutOil");
    }
    @Override
    public void extract() {
        System.out.println("Oil is extracted from seeds or fruits in subclass");
    }
    @Override
    public void store() {
        System.out.println("Oil is stored in containers in subclass");
    }
    @Override
    public void cook() {
        System.out.println("Oil is used for cooking in subclass");
    }
    @Override
    public void viscosity() {
        System.out.println("Oil has viscosity in subclass");
    }
    @Override
    public void use() {
        System.out.println("Oil has multiple uses in subclass");
    }

}
