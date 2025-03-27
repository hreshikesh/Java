package com.xworkz.relation;

public class Lens {
    private String lensSize;
    private String lensType;

    Lens(String lensSize,String lensType){
        this.lensSize=lensSize;
        this.lensType=lensType;
    }

    public void project(){
        System.out.println("------------------------------");
        System.out.println("Running Lens");
        System.out.println("Lens Size "+this.lensType);
        System.out.println("Lens Type "+this.lensSize);
    }
}
