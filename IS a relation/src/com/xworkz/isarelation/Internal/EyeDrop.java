package com.xworkz.isarelation.Internal;

public class EyeDrop extends Drop {
    public EyeDrop() {
        System.out.println("Running no-arg constructor of EyeDrop");
    }
    @Override
    public void liquidType() {
        System.out.println("Drop contains liquid in subclass");
    }
    @Override
    public void volume() {
        System.out.println("Drop has a small volume in subclass");
    }
    @Override
    public void use() {
        System.out.println("Drop is used for various purposes in subclass");
    }
    @Override
    public void absorption() {
        System.out.println("Drop can be absorbed in subclass");
    }
    @Override
    public void dispense() {
        System.out.println("Drop is dispensed from a container in subclass");
    }
}
