package com.xworkz.classparameter.Barber;

public class Saloon {
    String saloonOwnerName;
   public  Saloon(String saloonOwnerName){
        this.saloonOwnerName=saloonOwnerName;

    }
    void ownerName(){
        System.out.println("Saloon belong to barber :"+this.saloonOwnerName);
    }
}
