package com.xworkz.classasvariable.Cricket;

public class CricketRunner {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Cricket cricket=new Cricket(ticket);
        cricket.cricketSeatType();
        cricket.watch();
        Profit profit=new Profit(ticket);
        profit.profit();

    }


}
