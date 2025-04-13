package com.xworkz.ToString.Internal;

public class Mobile {
    private String brand;
    private String model;
    private int price;

    public Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile brand " + this.brand + " model " + this.model + " battery " + this.price ;
    }
    @Override
    public int hashCode() {
        return 1021;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Mobile) {
                Mobile  mobile1 = this;
                Mobile mobile2 = (Mobile) obj;
                if ( mobile1.model.equals(mobile2.model)) {
                    System.out.println("Same model and price");
                    return true;
                }
            }
        }
        return false;
    }

}
