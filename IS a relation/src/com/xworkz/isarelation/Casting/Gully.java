package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bat;
import com.xworkz.isarelation.Internal.SportsEquipment;

public class Gully {
    public void wicket(SportsEquipment equipment){
        equipment.use();
        equipment.durability();
        equipment.brand();
        equipment.maintenance();
        equipment.cost();
        if(equipment instanceof Bat){
            System.out.println("In BAt");
            Bat bat=(Bat) equipment;
            bat.broke();
        }
    }
}
