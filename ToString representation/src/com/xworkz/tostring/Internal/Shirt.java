package com.xworkz.tostring.Internal;

public class Shirt {
    private String brand;
    private String color;
    private int cost;

    public Shirt(String brand,String color,int cost){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Shirt brand "+this.brand+" Shirt cost "+this.cost+" Shirt Color "+this.color;
    }
}
