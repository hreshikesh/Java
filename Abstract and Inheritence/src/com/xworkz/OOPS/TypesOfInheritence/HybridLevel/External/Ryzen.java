package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

public class Ryzen extends AMD{
    @Override
    public void compute(){
        System.out.println("AMD ryzen Processor Computing");
    }
    @Override
    public void process(){
        System.out.println("Processing AMD Ryzen processor");
    }
}
