package com.xworkz.classparameter.Shop;

public class Shop {
    public void ads(Display display){
        System.out.println("Running Shop");
        if(display !=null) {
            display.run();
        }
        else{
            System.out.println("display is pointing to null");
        }
    }
}
