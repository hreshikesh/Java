package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

public class Bee extends FlyingInsect {
    @Override
    public void bite() {
        System.out.println("FlyingInsect Bitr");
    }

    @Override
    public void fly() {
        System.out.println("Insect Flying");
    }
}
