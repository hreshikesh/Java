package com.xworkz.isarelation.Internal;

public class Report extends Document {
    public Report() {
        System.out.println("no arg const in report");

    }
    @Override
    public void read() {
        System.out.println("Running read in subclass");
    }
    @Override

    public void edit() {
        System.out.println("Running edit in subclass");
    }
    @Override
    public void write() {
        System.out.println("Running write in subclass");
    }
    @Override
    public void print() {
        System.out.println("Running print in subclass");
    }
    @Override
    public void delete() {
        System.out.println("Running delete in subclass");
    }

}
