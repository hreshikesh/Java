package com.xworkz.classparameter.RCB;

public class RCB {
    public void getInfo(IPL ipl){
        System.out.println("Team info:");
        if(ipl !=null) {
            ipl.info();
        }
        else{
            System.out.println("ipl pointing to null");
        }
    }
}
