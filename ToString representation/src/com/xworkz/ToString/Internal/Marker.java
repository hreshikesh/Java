package com.xworkz.ToString.Internal;

public class Marker {
    private String color;
    private String brand;
    private int price;

    public Marker(String color, String brand, int price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marker color: " + color + ", brand: " + brand + ", price: " + price;
    }
    @Override
    public int hashCode() {
        return 589;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Marker) {
                Marker marker1 = this;
                Marker marker2 = (Marker) obj;
                if (marker1.color.equals(marker2.color) &&
                        marker1.brand.equals(marker2.brand) &&
                        marker1.price == marker2.price) {
                    System.out.println("Same color, brand, and price");
                    return true;
                }
            }
        }
        return false;
    }


}
