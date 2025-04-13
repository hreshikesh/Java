package com.xworkz.ToString.Internal;

public class Shirt {
    private String brand;
    private String color;
    private int cost;

    public Shirt(String brand,String color,int cost){
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Shirt brand "+this.brand+" Shirt cost "+this.cost+" Shirt Color "+this.color;
    }
    @Override
    public int hashCode() {
        return -1478985;
    }
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Shirt) {
                Shirt shirt1 = this;
                Shirt shirt2 = (Shirt) obj;
                if (shirt1.cost == shirt2.cost) {
                    System.out.println("Same cost");
                    return true;
                }
            }
        }
        return false;
    }
}
