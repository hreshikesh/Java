package com.xworkz.isarelation.Internal;

public class Google extends Company {
    public Google() {
        System.out.println("no arg  const in google");
    }
    @Override
    public void location() {
        System.out.println("Running location in subclass");
    }
    @Override
    public void sector() {
        System.out.println("Running sector in subclass");
    }
    @Override
    public void revenue() {
        System.out.println("Running revenue in subclass");
    }
    @Override
    public void type() {
        System.out.println("Running type in subclass");
    }
    @Override
    public void salary() {
        System.out.println("Running salary in subclass");
    }
}
