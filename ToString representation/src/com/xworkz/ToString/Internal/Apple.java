package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return 110;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Apple) {
                Apple apple1 = this;
                Apple apple2 = (Apple) obj;
                if (apple1.variety.equals(apple2.variety) &&
                        apple1.weight == apple2.weight &&
                        apple1.price == apple2.price) {
                    System.out.println("Same variety, weight and price");
                    return true;
                }
            }
        }
        return false;
    }

}
