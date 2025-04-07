package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Cycle;
import com.xworkz.isarelation.Internal.Motorcycle;

public class Motor {
    public void shaft(Cycle cycle){
        cycle.pedal();
        cycle.brake();
        cycle.wheels();
        cycle.ringBell();
        cycle.stand();
        if(cycle instanceof Motorcycle){
            System.out.println("In MOtorCycle");
            Motorcycle motorcycle=(Motorcycle) cycle;
            motorcycle.service();
        }
    }
}
