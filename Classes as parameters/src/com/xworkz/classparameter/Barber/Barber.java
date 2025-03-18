package com.xworkz.classparameter.Barber;

public class Barber {
    public void getName(Saloon saloon){
        if(saloon!=null){
            saloon.ownerName();
        }
        else{
            System.out.println("Pointing to null");
        }
    }
}
