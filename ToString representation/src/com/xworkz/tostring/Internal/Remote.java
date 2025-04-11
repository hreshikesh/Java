package com.xworkz.tostring.Internal;

public class Remote {
    private String company;
    private String color;
    private int price;

    public Remote(String company, String color, int price) {
        this.company = company;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Remote company " + this.company + " color " + this.color + " price " + this.price;
    }
    @Override
    public int hashCode() {
        return 51551020;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Remote) {
                Remote r1 = this;
                Remote r2 = (Remote) obj;
                if (r1.company.equals(r2.company) && r1.color.equals(r2.color)) {
                    System.out.println("Same company and color");
                    return true;
                }
            }
        }
        return false;
    }

}
