package com.xworkz.relation;

public class Remote {
    private Battery battery;
    private String brand;
    private int range;

    Remote(Battery battery,String brand,int range){
        this.battery=battery;
        this.brand=brand;
        this.range=range;
    }

    void change(){
        System.out.println("---------------------------");
        System.out.println("Running Remote ");
        this.battery.blast();
        System.out.println("remote Brand "+this.brand);
        System.out.println("remote range "+this.range+"m");
    }
}
