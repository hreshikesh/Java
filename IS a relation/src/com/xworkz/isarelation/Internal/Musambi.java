package com.xworkz.isarelation.Internal;

public class Musambi extends Fruit{
    public  Musambi(){
        System.out.println("No arg const of musambi");
    }    @Override
    public void smell() {
        System.out.println("Running smell in subclass");
    }
    @Override
    public void eat() {
        System.out.println("Running eat in subclass");
    }
    @Override
    public void juice() {
        System.out.println("Running juice in subclass");
    }
    @Override
    public void cut() {
        System.out.println("Running cut in subclass");
    }
    @Override
    public void fresh() {
        System.out.println("Running fresh in subclass");
    }

}
