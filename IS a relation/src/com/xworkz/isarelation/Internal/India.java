package com.xworkz.isarelation.Internal;

public class India extends Country{
    public India() {
        System.out.println("Running no-arg constructor of India");
    }
    @Override
    public void continent() {
        System.out.println("This country belongs to a continent in subclass");
    }
    @Override
    public void population() {
        System.out.println("Every country has a population in subclass");
    }
    @Override
    public void government() {
        System.out.println("Each country has a type of government in subclass");
    }
    @Override
    public void currency() {
        System.out.println("Each country has its own currency in subclass");
    }
    @Override
    public void language() {
        System.out.println("Each country has its official languages in subclass");
    }
}
