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
    @Override
    public int hashCode() {
        return -87;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Pant) {
                Pant pant1 = this;
                Pant pant2 = (Pant) obj;
                if (pant1.cost == pant2.cost) {
                    System.out.println("Same cost");
                    return true;
                }
            }
        }
        return false;
    }
}
