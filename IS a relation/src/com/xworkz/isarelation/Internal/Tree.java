package com.xworkz.isarelation.Internal;

public class Tree extends Plant{
    public Tree() {
        System.out.println("Running no-arg constructor of Tree");
    }
    @Override
    public void grow() {
        System.out.println("The plant is growing in subclass");
    }
    @Override
    public void absorbSunlight() {
        System.out.println("The plant is absorbing sunlight in subclass ");
    }
    @Override
    public void photosynthesize() {
        System.out.println("The plant is photosynthesizing in subclass ");
    }
    @Override
    public void reproduce() {
        System.out.println("The plant is reproducing in subclass");
    }
    @Override
    public void consumeWater() {
        System.out.println("The plant is consuming water in subclass");
    }
}
