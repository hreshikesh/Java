package com.xworkz.tostring.Internal;

public class Bag {
    private String brand;
    private String color;
    private int capacity;

    public Bag(String brand,String color,int capacity){
        this.brand=brand;
        this.color=color;
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        return "bag brand "+this.brand+" Bag color "+this.color+" Bag capacity "+this.capacity;
    }
}
