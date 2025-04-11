package com.xworkz.tostring.Internal;

public class IronBox {

    private String brand;
    private int wattage;
    private int price;

    public IronBox(String brand, int wattage, int price) {
        this.brand = brand;
        this.wattage = wattage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IronBox brand " + this.brand + " wattage " + this.wattage + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -1;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof IronBox) {
                IronBox ironBox1 = this;
                IronBox ironBox2 = (IronBox) obj;
                if (ironBox1.brand.equals(ironBox2.brand) && ironBox1.wattage == ironBox2.wattage) {
                    System.out.println("Same brand and wattage");
                    return true;
                }
            }
        }
        return false;
    }

}
