package com.xworkz.Final.Internal;

public class Bat {
    private final String  brand="Virant";
    private final String type="CricketBat";


    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }


    public final void hit(){
        System.out.println("Running hit");
    }
}
