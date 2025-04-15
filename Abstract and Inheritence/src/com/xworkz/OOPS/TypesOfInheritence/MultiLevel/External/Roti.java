package com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External;

public class Roti extends Chapati{
    @Override
    public void prepare() {
        System.out.println("Prepare Roti");
    }

    @Override
    public void eat() {
        System.out.println("Eat Roti");
    }
}
