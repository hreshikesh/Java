package com.xworkz.classparameter.Mango;

public class Mango {
    public void getPrice(Price price){
        System.out.println("The mango price");
        if(price!=null){
            price.price(30);
        }
        else{
            System.out.println("pointing to null");
        }
    }
}
