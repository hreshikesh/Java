package com.xworkz.relation;

public class Board {
    private Capacitor capacitor;
    private String boardName;
    private  int price;

    Board(Capacitor capacitor,String boardName,int price){
        this.capacitor=capacitor;
        this.boardName=boardName;
        this.price=price;
    }

    void integrate(){
        System.out.println("---------------------------");
        System.out.println("Running Board ");
        System.out.println("Board Name"+this.boardName);
        this.capacitor.store();
        System.out.println("Board Price "+this.price);
    }
}
