package com.xworkz.relation;

public class Screw {
    private int screwSize;
    private  String screwMaterial;

    Screw(int screwSize,String screwMaterial){
        this.screwSize=screwSize;
        this.screwMaterial=screwMaterial;
    }

    void putScrew(){
        System.out.println("---------------------------");
        System.out.println("Running Screw");
        System.out.println("Screw size"+this.screwSize+"mm");
        System.out.println("Screw material "+this.screwMaterial);

    }
}
