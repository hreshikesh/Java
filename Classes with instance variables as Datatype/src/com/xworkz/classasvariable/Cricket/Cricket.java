package com.xworkz.classasvariable.Cricket;

public class Cricket {
    Ticket ticket;

    public Cricket(Ticket ticket){
        this.ticket=ticket;
    }

    public void cricketSeatType(){
        if(this.ticket!=null){
            System.out.println("Seat Type");
            this.ticket.type();

        }
        else System.err.println("Pointing to null");
    }

    public void watch(){
        if(this.ticket!=null){
            this.ticket.buy();
            System.out.println("Watching cricket");
        }
        else System.err.println("Pointing to null");
    }
}
