package com.xworkz.tostring.Internal;

public class Plate {
    private String material;
    private int diameter;
    private int price;

    public Plate(String material, int diameter, int price) {
        this.material = material;
        this.diameter = diameter;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plate material: " + material + ", diameter: " + diameter + "cm, price: " + price;
    }
    @Override
    public int hashCode() {
        return 102000;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Plate) {
                Plate plate1 = this;
                Plate plate2 = (Plate) obj;
                if (plate1.material.equals(plate2.material) &&
                        plate1.diameter == plate2.diameter &&
                        plate1.price == plate2.price) {
                    System.out.println("Same material, diameter and price");
                    return true;
                }
            }
        }
        return false;
    }



}
