package com.xworkz.tostring.Internal;

public class ToothPaste {
    private String brand;
    private String flavor;
    private int price;

    public ToothPaste(String brand, String flavor, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toothpaste brand " + this.brand + " flavor " + this.flavor + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return -2003;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof ToothPaste) {
                ToothPaste toothPaste1 = this;
                ToothPaste toothPaste2 = (ToothPaste) obj;
                if (toothPaste1.brand.equals(toothPaste2.brand) && toothPaste1.flavor.equals(toothPaste2.flavor)) {
                    System.out.println("Same brand and flavor");
                    return true;
                }
            }
        }
        return false;
    }

}
