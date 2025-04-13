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
                Remote remote1 = this;
                Remote remote2 = (Remote) obj;
                if (remote1.company.equals(remote2.company) && remote1.color.equals(remote2.color)) {
                    System.out.println("Same company and color");
                    return true;
                }
            }
        }
        return false;
    }

}
