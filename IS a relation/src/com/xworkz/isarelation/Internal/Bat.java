package com.xworkz.isarelation.Internal;

public class Bat extends SportsEquipment{
    public Bat() {
        System.out.println("Running no-arg constructor of Bat");
    }
    @Override
    public void use() {
        System.out.println("Sports equipment is used in various sports in subclass");
    }
    @Override
    public void durability() {
        System.out.println("Sports equipment is made to be durable in subclass");
    }
    @Override
    public void brand() {
        System.out.println("Sports equipment comes in various brands in subclass");
    }
    @Override
    public void maintenance() {
        System.out.println("Sports equipment needs proper maintenance in subclass");
    }
    @Override
    public void cost() {
        System.out.println("Sports equipment has different price ranges in subclass");
    }


    public void broke(){
        System.out.println("Broke bat in Bat");
    }
}
