package com.xworkz.tostring.Internal;

public class Mouse {
    private String brand;
    private String type;
    private int price;

    public Mouse(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse brand " + this.brand + " type " + this.type + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 111;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Mouse) {
                Mouse mouse1 = this;
                Mouse mouse2 = (Mouse) obj;
                if (mouse1.brand.equals(mouse2.brand) && mouse1.type.equals(mouse2.type)) {
                    System.out.println("Same brand and type");
                    return true;
                }
            }
        }
        return false;
    }

}
