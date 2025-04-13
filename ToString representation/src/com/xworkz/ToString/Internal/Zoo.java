package com.xworkz.ToString.Internal;

public class Zoo {
    private String zooName;
    private int ticketPrice;
    private String owner;

    public Zoo(String zooName,String owner,int ticketPrice){
        this.zooName=zooName;
        this.owner=owner;
        this.ticketPrice=ticketPrice;
    }

    @Override
    public String toString() {
        return "Zoo brand "+this.zooName+" Zoo cost "+this.owner+" Zoo Color "+this.ticketPrice;
    }
    @Override
    public int hashCode() {
        return -2140000000;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Zoo) {
                Zoo zoo1 = this;
                Zoo zoo2 = (Zoo) obj;
                if (zoo1.ticketPrice == zoo2.ticketPrice) {
                    System.out.println("Same ticket price");
                    return true;
                }
            }
        }
        return false;
    }
}
