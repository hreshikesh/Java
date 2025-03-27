package com.xworkz.relation;

public class Lamp {
    private Warranty warranty;
    private String lampType;
    private  int intensity;

    Lamp(Warranty warranty,String lampType,int intensity){
        this.warranty=warranty;
        this.lampType =lampType;
        this.intensity=intensity;
    }

    void light(){
        System.out.println("---------------------------");
        System.out.println("Running Lamp");
        warranty.claim();
        System.out.println("Lamp type"+this.lampType);
        System.out.println("Lamp intensity "+this.intensity);
    }

}
