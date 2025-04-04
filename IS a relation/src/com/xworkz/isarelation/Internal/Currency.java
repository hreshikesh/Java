package com.xworkz.isarelation.Internal;

public class Currency extends Money{
    public Currency() {
        System.out.println("Running no-arg constructor of Currency");
    }
    @Override
    public void exchange() {
        System.out.println("Money is used as a medium of exchange in subclass");
    }
    @Override
    public void value() {
        System.out.println("Money has a certain value in subclass");
    }
    @Override
    public void store() {
        System.out.println("Money can be stored for future use in subclass");
    }
    @Override
    public void transfer() {
        System.out.println("Money can be transferred between entities in subclass");
    }
    @Override
    public void buyGoods() {
        System.out.println("Money is used to buy goods and services in subclass");
    }
}
