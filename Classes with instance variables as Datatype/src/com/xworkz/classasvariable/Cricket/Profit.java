package com.xworkz.classasvariable.Cricket;

public class Profit {
    Ticket ticket;
    Profit(Ticket ticket){
        this.ticket=ticket;
    }
    void profit(){
        if(this.ticket!=null){
            System.out.println("Running profit");
            this.ticket.sell();
        }
        else System.err.println("Pointing to null");
    }
}
