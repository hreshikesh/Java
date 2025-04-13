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
    @Override
    public int hashCode() {
        return 5700;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Candle) {
                Candle candle1 = this;
                Candle candle2 = (Candle) obj;
                if (candle1.scent.equals(candle2.scent) &&
                        candle1.weight == candle2.weight &&
                        candle1.price == candle2.price) {
                    System.out.println("Same scent, weight, and price");
                    return true;
                }
            }
        }
        return false;
    }


}
