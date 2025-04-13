package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return -1212;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof TV) {
                TV tv1 = this;
                TV tv2 = (TV) obj;
                if (tv1.cost == tv2.cost) {
                    System.out.println("Same cost");
                    return true;
                }
            }
        }
        return false;
    }
}
