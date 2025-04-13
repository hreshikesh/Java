package com.xworkz.ToString.Internal;

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
    @Override
    public int hashCode() {
        return 2003;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Ticket) {
                Ticket ticket1 = this;
                Ticket ticket2 = (Ticket) obj;
                if (ticket1.event.equals(ticket2.event) && ticket1.date.equals(ticket2.date)) {
                    System.out.println("Same event and date");
                    return true;
                }
            }
        }
        return false;
    }


}
