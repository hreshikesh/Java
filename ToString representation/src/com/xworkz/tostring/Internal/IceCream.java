package com.xworkz.tostring.Internal;

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
}
