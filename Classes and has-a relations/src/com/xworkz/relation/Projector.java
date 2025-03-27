package com.xworkz.relation;

public class Projector {
    private String projectorCompany;
    private int price;

     private Lens lens;
     private Lamp lamp;
     private Port port;
     private Wire wire;
     private Board board;
     private Button button;
     private Panel panel;
     private Remote remote;
     private Screw screw;



    public Projector(String projectorCompany,int price,Lens lens,Lamp lamp,Port port,Wire wire,Board board,Button button,Panel panel,Remote remote,Screw screw){
        this.projectorCompany=projectorCompany;
        this.price=price;


        this.lens=lens;
        this.lamp=lamp;
        this.port=port;
        this.wire=wire;
        this.board=board;
        this.button=button;
        this.panel=panel;
        this.remote=remote;
        this.screw=screw;
    }


     public void play(){
         System.out.println("Running in projector");
         System.out.println("Projector Company "+this.projectorCompany);
         System.out.println("Projector price "+this.price);
         this.lens.project();
         this.lamp.light();
         this.port.portIn();
         this.wire.connect();
         this.board.integrate();
         this.button.press();
         this.panel.control();
         this.remote.change();
         this.screw.putScrew();
     }
}
