package com.xworkz.tostring.Internal;

public class Tshirt {
    private String brand;
    private String color;
    private int cost;

    public Tshirt(String brand,String color,int cost){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Shirt brand "+this.brand+" Shirt cost "+this.cost+" Shirt Color "+this.color;
    }
}
