package com.xworkz.isarelation.Internal;

public class Heart extends Organ{
    public Heart() {
        System.out.println("Running no-arg constructor of Heart");
    }
    @Override
    public void function() {
        System.out.println("Organ performs a vital function in the body in subclass");
    }
    @Override
    public void bloodSupply() {
        System.out.println("Organ receives blood supply for proper functioning in subclass");
    }
    @Override
    public void regulation() {
        System.out.println("Organ is regulated by the nervous system in subclass");
    }
    @Override
    public void growth() {
        System.out.println("Organ grows and develops over time in subclass");
    }
    @Override
    public void repair() {
        System.out.println("Organ has the ability to repair in subclass");
    }
    public void pump(){
        System.out.println("Pumping in Heart");
    }
}
