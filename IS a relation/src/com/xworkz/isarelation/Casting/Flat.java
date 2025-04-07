package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Door;
import com.xworkz.isarelation.Internal.WoodenDoor;

public class Flat {
    public void clean(Door door){
        door.open();
        door.close();
        door.lock();
        door.unlock();
        door.material();
        if(door instanceof WoodenDoor){
            System.out.println("In WoodenDoor");
            WoodenDoor woodenDoor=(WoodenDoor) door;
            woodenDoor.breakDoor();
        }
    }
}
