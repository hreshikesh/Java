package com.xworkz.tostring.Internal;

public class Ticket {
    private String event;
    private String date;
    private int price;

    public Ticket(String event, String date, int price) {
        this.event = event;
        this.date = date;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket event " + this.event + " date " + this.date + " price " + this.price;
    }

}
