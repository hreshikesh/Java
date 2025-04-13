package com.xworkz.tostring.Internal;

public class DiningTable {
    private String shape;
    private int seats;
    private int price;

    public DiningTable(String shape, int seats, int price) {
        this.shape = shape;
        this.seats = seats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DiningTable shape: " + shape + ", seats: " + seats + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return 58700;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof DiningTable) {
                DiningTable diningTable1 = this;
                DiningTable diningTable2 = (DiningTable) obj;
                if (diningTable1.shape.equals(diningTable2.shape) &&
                        diningTable1.seats == diningTable2.seats &&
                        diningTable1.price == diningTable2.price) {
                    System.out.println("Same shape, seats, and price");
                    return true;
                }
            }
        }
        return false;
    }


}
