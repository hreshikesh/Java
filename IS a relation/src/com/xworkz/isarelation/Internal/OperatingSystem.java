package com.xworkz.isarelation.Internal;

public class OperatingSystem extends Software {
    public OperatingSystem() {
        System.out.println("Running no-arg constructor of OperatingSystem");
    }
    @Override
    public void install() {
        System.out.println("Installing software in subclass");
    }
    @Override
    public void run() {
        System.out.println("Running software in subclass");
    }
    @Override
    public void update() {
        System.out.println("Updating software in subclass");
    }
    @Override
    public void uninstall() {
        System.out.println("Uninstalling software in subclass");
    }
    @Override
    public void configure() {
        System.out.println("Configuring software settings in subclass");
    }

    public void osVersion(){
        System.out.println("Running Os Version In Operating System");
    }
}
