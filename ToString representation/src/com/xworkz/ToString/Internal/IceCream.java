package com.xworkz.ToString.Internal;

public class IceCream {
    private String brand;
    private String flavour;
    private int cost;

    public IceCream(String brand,String flavour,int cost){
        this.brand=brand;
        this.flavour=flavour;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return "Icecream brand "+this.brand+" IceCream cost "+this.cost+" Icecream flavour "+this.flavour;
    }
    @Override
    public int hashCode() {
        return -1020;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof IceCream) {
                IceCream ice1 = this;
                IceCream ice2 = (IceCream) obj;
                if (ice1.cost == ice2.cost) {
                    System.out.println("Same cost");
                    return true;
                }
            }
        }
        return false;
    }
}
