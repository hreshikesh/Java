package com.xworkz.relation;

public class Battery {
    private Voltage voltage;
    private int capacity;
    private String batteryType;

    Battery(Voltage voltage,int capacity,String batteryType){
        this.voltage=voltage;
        this.capacity=capacity;
        this.batteryType=batteryType;
    }

    void blast(){
        System.out.println("Running Battery ");
        System.out.println("battery capacity "+this.capacity+"mah");
        this.voltage.flow();
        System.out.println("Battery Type "+this.batteryType);
    }

}
