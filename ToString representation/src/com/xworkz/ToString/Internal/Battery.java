package com.xworkz.ToString.Internal;

public class Battery {
    private String type;
    private String company;
    private int capacity;

    public Battery(String type, String company, int capacity) {
        this.type = type;
        this.company = company;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Battery type " + this.type + " company " + this.company + " capacity" + this.capacity+"V";
    }
    @Override
    public int hashCode() {
        return 105;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Battery) {
                Battery b1 = this;
                Battery b2 = (Battery) obj;
                if (b1.company.equals(b2.company) && b1.capacity == b2.capacity) {
                    System.out.println("Same company and capacity");
                    return true;
                }
            }
        }
        return false;
    }

}
