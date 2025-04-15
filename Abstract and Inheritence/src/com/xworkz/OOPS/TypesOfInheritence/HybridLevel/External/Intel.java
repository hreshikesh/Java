package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Processor;

public class Intel extends Processor {
    @Override
    public void compute(){
        System.out.println("Intel Processor Computing");
    }

    public void process(){
        System.out.println("Processing AMD processor");
    }
}
