package com.xworkz.isarelation.Internal;

public class RCB extends Team{
    public RCB() {
        System.out.println("Running no-arg constructor of RCB");
    }
    @Override
    public void play() {
        System.out.println("Team participates in matches in subclass");
    }
    @Override
    public void train() {
        System.out.println("Team undergoes regular training in subclass");
    }
    @Override
    public void compete() {
        System.out.println("Team competes in tournaments in subclass");
    }
    @Override
    public void strategize() {
        System.out.println("Team makes game strategies in subclass");
    }
    @Override
    public void celebrate() {
        System.out.println("Team celebrates victories in subclass");
    }
}
