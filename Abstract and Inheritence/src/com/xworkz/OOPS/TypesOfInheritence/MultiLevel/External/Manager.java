package com.xworkz.OOPS.TypesOfInheritence.MultiLevel.External;

public class Manager extends Employee {
    @Override
    public void request() {
        System.out.println("Request Manager");
    }
    @Override
    public void work(){
        System.out.println("Working Manager");
    }
}
