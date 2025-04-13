package com.xworkz.ToString.Internal;

public class Cake {
    private String bakeryName;
    private String flavour;
    private int price;

    public Cake(String bakeryName,String flavour,int price){
        this.bakeryName=bakeryName;
        this.flavour=flavour;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Cake Bakery Name "+this.bakeryName+" Cake price "+this.price+" Pant flavour "+this.flavour;
    }
    @Override
    public int hashCode() {
        return 500;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Cake) {
                Cake cake1 = this;
                Cake cake2 = (Cake) obj;
                if (cake1.price == cake2.price) {
                    System.out.println("Same price");
                    return true;
                }
            }
        }
        return false;
    }
}
