package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Airplane;
import com.xworkz.isarelation.Internal.Jet;

public class Airport {
    public void signal(Airplane airplane){
        airplane.takeOff();
        airplane.fly();
        airplane.land();
        airplane.fuelCapacity();
        airplane.passengers();
        if(airplane instanceof Jet){
            System.out.println("In jet");
            Jet jet=(Jet) airplane;
            jet.speed();
        }
    }
}
