package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

public class ElectricCar extends Car{
    @Override
    public void drive(){
        System.out.println("drive  Electric car vehicle");
    }

    @Override
    public void speed() {
        System.out.println("Speed Electric Car");
    }
}
