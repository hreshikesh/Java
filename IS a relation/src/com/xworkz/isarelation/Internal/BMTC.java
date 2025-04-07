package com.xworkz.isarelation.Internal;

public class BMTC extends Bus{
    public BMTC(){
        System.out.println("no arg const of BMTC");
    }
    @Override
    public void ticket() {
        System.out.println("Running ticket in subclass");
    }
    @Override
    public void pass() {
        System.out.println("Running pass in subclass");
    }
    @Override
    public void seat() {
        System.out.println("Running seat in subclass");
    }
    @Override
    public void stand() {
        System.out.println("Running stand in subclass");
    }
    @Override
    public void reserved() {
        System.out.println("Running reserved in subclass");
    }
    public void type(){
        System.out.println("Running type in bmtc");
    }

}
