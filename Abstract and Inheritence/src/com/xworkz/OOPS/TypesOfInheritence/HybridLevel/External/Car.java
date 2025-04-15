package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Vehicle;

public class Car extends Vehicle {
    @Override
    public void drive(){
        System.out.println("drive  car vehicle");
    }

    public void speed(){
        System.out.println("Speed car");
    }
}
