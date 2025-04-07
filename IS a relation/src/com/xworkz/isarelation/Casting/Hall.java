package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Light;
import com.xworkz.isarelation.Internal.TubeLight;

public class Hall {
    public void program(Light light){
        light.turnOn();
        light.turnOff();
        light.brightness();
        light.color();
        light.powerSource();
        if(light instanceof TubeLight){
            System.out.println("In Tubelight");
            TubeLight tubeLight=(TubeLight) light;
            tubeLight.intensity();
        }
    }
}
