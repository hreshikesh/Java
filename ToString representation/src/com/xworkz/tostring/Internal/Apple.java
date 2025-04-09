package com.xworkz.tostring.Internal;

public class Apple {
    private String variety;
    private int weight;
    private int price;

    public Apple(String variety, int weight, int price) {
        this.variety = variety;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple variety: " +  this.variety + ", weight: " +  this.weight + "g, price: " +  this.price;
    }
}
