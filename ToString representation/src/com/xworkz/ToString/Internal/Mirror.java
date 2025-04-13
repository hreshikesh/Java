package com.xworkz.ToString.Internal;

public class Mirror {
    private String shape;
    private int height;
    private int price;

    public Mirror(String shape, int height, int price) {
        this.shape = shape;
        this.height = height;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mirror shape: " + shape + ", height: " + height + "cm, price: " + price;
    }
    @Override
    public int hashCode() {
        return 8;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Mirror) {
                Mirror mirror1 = this;
                Mirror mirror2 = (Mirror) obj;
                if (mirror1.shape.equals(mirror2.shape) &&
                        mirror1.height == mirror2.height &&
                        mirror1.price == mirror2.price) {
                    System.out.println("Same shape, height and price");
                    return true;
                }
            }
        }
        return false;
    }

}
