package com.xworkz.tostring.Internal;

public class Umbrella {
    private String color;
    private int length;
    private int price;

    public Umbrella(String color, int length, int price) {
        this.color = color;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Umbrella color: " + color + ", length: " + length + "cm, price: " + price;
    }
    @Override
    public int hashCode() {
        return 1587995;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Umbrella) {
                Umbrella umbrella1 = this;
                Umbrella umbrella2 = (Umbrella) obj;
                if (umbrella1.color.equals(umbrella2.color) &&
                        umbrella1.length == umbrella2.length &&
                        umbrella1.price == umbrella2.price) {
                    System.out.println("Same color, length and price");
                    return true;
                }
            }
        }
        return false;
    }



}
