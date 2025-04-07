package com.xworkz.isarelation.Internal;

public class Manager extends Employee{
    public Manager() {
        System.out.println("No-arg constructor of Manager");
    }
    @Override
    public void work() {
        System.out.println("Running work in subclass");
    }
    @Override
    public void attendMeeting() {
        System.out.println("Running attendMeeting in subclass");
    }
    @Override
    public void takeBreak() {
        System.out.println("Running takeBreak in subclass");
    }
    @Override
    public void submitReport() {
        System.out.println("Running submitReport in subclass");
    }
    @Override
    public void getSalary() {
        System.out.println("Running getSalary in subclass");
    }
    public void fire(){
        System.out.println("Running fire in Manager");
    }
}
