package com.xworkz.tostring.Internal;

public class Pant {
    private String brand;
    private String color;
    private int cost;

    public Pant(String brand,String color,int cost){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Pant brand "+this.brand+" Pant cost "+this.cost+" Pant Color "+this.color;
    }
}
