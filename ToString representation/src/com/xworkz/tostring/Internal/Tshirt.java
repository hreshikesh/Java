package com.xworkz.tostring.Internal;

public class Tshirt {
    private String brand;
    private String color;
    private int cost;

    public Tshirt(String brand,String color,int cost){
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
        return -181845;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Tshirt) {
                Tshirt t1 = this;
                Tshirt t2 = (Tshirt) obj;
                if (t1.brand.equals(t2.brand) && t1.color.equals(t2.color)) {
                    System.out.println("Same brand and color");
                    return true;
                }
            }
        }
        return false;
    }

}
