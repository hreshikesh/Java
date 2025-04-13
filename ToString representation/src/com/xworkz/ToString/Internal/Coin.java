package com.xworkz.ToString.Internal;

public class Coin {
    private String coinName;
    private String material;
    private int year;

    public Coin(String coinName, String material, int year) {
        this.coinName = coinName;
        this.material = material;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin denomination " + this.coinName + " material " + this.material + " year " + this.year;
    }
    @Override
    public int hashCode() {
        return 5058940;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Coin) {
                Coin coin1 = this;
                Coin coin2 = (Coin) obj;
                if (coin1.coinName.equals(coin2.coinName) && coin1.material.equals(coin2.material)) {
                    System.out.println("Same coinName and material");
                    return true;
                }
            }
        }
        return false;
    }

}
