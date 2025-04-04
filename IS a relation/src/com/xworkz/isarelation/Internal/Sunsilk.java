package com.xworkz.isarelation.Internal;

public class Sunsilk extends Shampoo{
    public Sunsilk(){
        System.out.println("no args const of Sunsilk");
    }
    @Override
    public void apply() {
        System.out.println("Running apply in subclass");
    }
    @Override
    public void rinse() {
        System.out.println("Running rinse in subclass");
    }
    @Override
    public void wash() {
        System.out.println("Running wash in subclass");
    }
    @Override
    public void clean() {
        System.out.println("Running clean in subclass");
    }
    @Override
    public void rub() {
        System.out.println("Running rub in subclass");
    }
}
