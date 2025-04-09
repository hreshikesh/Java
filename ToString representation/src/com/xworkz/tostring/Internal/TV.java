package com.xworkz.tostring.Internal;

public class TV {
    private String brand;
    private int size;
    private int cost;

    public TV(String brand,int size,int cost){
        this.brand=brand;
        this.size=size;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "TV brand "+this.brand+" TV cost "+this.cost+" TV size "+this.size;
    }
}
