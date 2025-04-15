package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Processor;

public class AMD extends Processor {
    @Override
    public void compute(){
        System.out.println("AMD Processor Computing");
    }

    public void process(){
        System.out.println("Processing AMD processor");
    }
}
