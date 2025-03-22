package com.xworkz.references;

public class HouseKeep {
    String housekeeperName;
    Transport transport;

    public HouseKeep(String housekeeperName, Transport transport){
        this.housekeeperName=housekeeperName;
        this.transport=transport;
    }

    public void housekeeperDisplay(){
        System.out.println("House Kepper Name "+this.housekeeperName);
        if(this.transport!=null){
            this.transport.transportDisplay();
        }
    }
}
