package com.xworkz.relation;

public class Voltage {
    private double maxVolt;
    private double minVolt;

    Voltage(double maxVolt,double minVolt){
        this.maxVolt=maxVolt;
        this.minVolt=minVolt;

    }

    void flow(){
        System.out.println("Running Voltage ");
        System.out.println("Max Voltage "+this.maxVolt+"v");
        System.out.println("Min Voltage "+this.minVolt+"v");
    }
}
