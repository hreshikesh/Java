package com.xworkz.tostring.Internal;

public class Candle {
    private String scent;
    private int weight;
    private int price;

    public Candle(String scent, int weight, int price) {
        this.scent = scent;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candle scent: " + scent + ", weight: " + weight + "g, price: " + price;
    }

}
