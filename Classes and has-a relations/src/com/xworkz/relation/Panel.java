package com.xworkz.relation;

public class Panel {

    private String panelDisplayType;
    private int noofButtons;

    Panel(String panelDisplayType,int noofButtons){
        this.panelDisplayType=panelDisplayType;
        this.noofButtons=noofButtons;
    }

    void control(){
        System.out.println("---------------------------");
        System.out.println("Running Panel");
        System.out.println("Panel display type "+this.panelDisplayType);
        System.out.println("Total Buttons in Panel"+this.noofButtons);

    }
}
