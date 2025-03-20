package com.xworkz.classasvariable.ViratRoutine;

import com.xworkz.classasvariable.Clip.Clip;
import com.xworkz.classasvariable.Cricket.Cricket;
import com.xworkz.classasvariable.Cricket.Ticket;

public class Virat {
    Clip clip;
    Cricket cricket;
    Ticket ticket;
    Brush brush;

    Virat ( Clip clip,Cricket cricket,Ticket ticket,Brush brush){
        this.clip=clip;
        this.cricket=cricket;
        this.ticket=ticket;
        this.brush=brush;
    }

    void play(){
        if(this.cricket!=null){
            System.out.println("===================");
            System.out.println("Running cricket methods in play");
            this.cricket.cricketSeatType();
            this.cricket.watch();

        }else System.err.println("Pointing to null");
    }

    void clean(){
        if(this.brush!=null){
            System.out.println("===================");
            System.out.println("Running brush methods in clean");
            brush.clean();
            brush.color();
            brush.scrub();
        }else System.err.println("Pointing to null");
    }

    void relax(){
        if(this.ticket!=null){
            System.out.println("===================");
            System.out.println("Running ticket methods in relax");
            this.ticket.type();
            this.ticket.sell();
            this.ticket.buy();
            this.ticket.cost();
        }else System.err.println("Pointing to null");
    }

}
