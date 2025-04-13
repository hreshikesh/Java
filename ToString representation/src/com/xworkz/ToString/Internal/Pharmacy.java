package com.xworkz.ToString.Internal;

public class Pharmacy {
    private String name;
    private String location;
    private int rating;

   public Pharmacy(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Pharmacy name " + this.name + " location " + this.location + " rating " + this.rating;
    }
    @Override
    public int hashCode() {
        return 578946;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Pharmacy) {
                Pharmacy pharmacy1 = this;
                Pharmacy pharmacy2 = (Pharmacy) obj;
                if (pharmacy1.name.equals(pharmacy2.name) && pharmacy1.location.equals(pharmacy2.location)) {
                    System.out.println("Same name and location");
                    return true;
                }
            }
        }
        return false;
    }


}
