package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bike;
import com.xworkz.isarelation.Internal.Splender;

public class BikeTrip {
    public void plan(Bike bike){
        bike.tour();
        bike.race();
        bike.drag();
        bike.ride();
        bike.clutch();
        System.out.println("--------------");

        if(bike instanceof Splender){
            System.out.println("IN Splender");
            Splender splender=(Splender) bike;

            splender.carry();
        }
    }

}
