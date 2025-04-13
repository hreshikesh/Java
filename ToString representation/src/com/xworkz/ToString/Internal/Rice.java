package com.xworkz.ToString.Internal;

public class Rice {
    private String type;
    private int quantityInKg;
    private int price;

    public Rice(String type, int quantityInKg, int price) {
        this.type = type;
        this.quantityInKg = quantityInKg;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rice type: " + type + ", quantity: " + quantityInKg + "kg, price: " + price;
    }
    @Override
    public int hashCode() {
        return 4858;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Rice) {
                Rice rice1 = this;
                Rice rice2 = (Rice) obj;
                if (rice1.type.equals(rice2.type) &&
                        rice1.quantityInKg == rice2.quantityInKg &&
                        rice1.price == rice2.price) {
                    System.out.println("Same type, quantityInKg, and price");
                    return true;
                }
            }
        }
        return false;
    }


}

