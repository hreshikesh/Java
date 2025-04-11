package com.xworkz.tostring.Internal;

public class Oven {
    private String type;
    private int capacity;
    private int price;
    public Oven(String type, int capacity, int price) {
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Oven type " + this.type + " capacity " + this.capacity + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -1020;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Oven) {
                Oven o1 = this;
                Oven o2 = (Oven) obj;
                if (o1.capacity == o2.capacity && o1.price == o2.price) {
                    System.out.println("Same capacity and price");
                    return true;
                }
            }
        }
        return false;
    }
}
