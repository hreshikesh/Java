package com.xworkz.classasvariable.Cricket;

public class Ticket {
    TicketType[] type = TicketType.values();

    public void type() {
        TicketType[] type = TicketType.values();
        for (TicketType ref : type) {
            System.out.println("TYPE of ticket is" + ref);
        }
    }
    public void cost(){
        System.out.println("Running cost in Ticket");
    }
    public void buy(){
        System.out.println("Running buy in Ticket");
    }
    public void  sell(){
        System.out.println("Running sell in Ticket");
    }
}
