package com.xworkz.relation;

public class Capacitor {

    private String capacitorType;
    private int capacitorPrice;

    Capacitor(String capacitorType, int capacitorPrice){
        this.capacitorType=capacitorType;
        this.capacitorPrice=capacitorPrice;
    }

    void store(){
        System.out.println("Running Capacitor ");
        System.out.println("Capacitor Type "+this.capacitorType);
        System.out.println("Capacitor Price "+this.capacitorPrice);
    }

}
