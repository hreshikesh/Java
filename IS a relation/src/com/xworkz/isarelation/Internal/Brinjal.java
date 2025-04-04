package com.xworkz.isarelation.Internal;

public class Brinjal extends Vegetable{
    public Brinjal(){
        System.out.println("no arg const of Brinjal");
    }
    @Override
    public void cook() {
        System.out.println("Running Cook in subclass");
    }
    @Override
    public void sell() {
        System.out.println("Running sell in subclass");
    }
    @Override
    public void curry() {
        System.out.println("Running curry in subclass");
    }
    @Override
    public void chew() {
        System.out.println("Running chew in subclass");
    }
    @Override
    public void steam() {
        System.out.println("Running steam in subclass");
    }
}
