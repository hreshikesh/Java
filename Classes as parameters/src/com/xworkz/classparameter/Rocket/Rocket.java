package com.xworkz.classparameter.Rocket;

public class Rocket {
    public void getRocketSpeed(Speed speed){
        System.out.println("Chandrayana2 Rocket Speed");
        if(speed!=null){
            speed.rocketSpeed();
        }
        else{
            System.out.println("speed pointing to null");
        }
    }
}
