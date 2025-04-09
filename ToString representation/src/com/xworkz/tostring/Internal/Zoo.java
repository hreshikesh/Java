package com.xworkz.tostring.Internal;

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
}
