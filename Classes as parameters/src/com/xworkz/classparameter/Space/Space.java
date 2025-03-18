package com.xworkz.classparameter.Space;

public class Space {
    public void getStar(Star star){
        System.out.println("Running space");
        if(star!=null){
            star.getStarInfo();
        }
        else{
            System.out.println("No rocket info fount");
        }
    }
}
