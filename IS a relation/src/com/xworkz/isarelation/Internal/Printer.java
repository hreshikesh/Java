package com.xworkz.isarelation.Internal;

public class Printer extends OutputDevice {
    public Printer() {
        System.out.println("No arg const of Printer");
    }
    @Override
    public void output() {
        System.out.println("Running Output in subclass");
    }
    @Override
    public void print() {
        System.out.println("Running print in subclass");
    }
    @Override
    public void connect() {
        System.out.println("Running connect in subclass");
    }
    @Override
    public void disconnect() {
        System.out.println("Running disconnect in subclass");
    }
    @Override
    public void produce() {
        System.out.println("running produceoutput in subclass");
    }

}
