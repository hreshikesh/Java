package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bathroom;
import com.xworkz.isarelation.Internal.Room;

public class FreshUp {
    public void wash(Room room){
        room.openDoor();
        room.closeDoor();
        room.clean();
        room.ventilate();
        room.occupy();
        if(room instanceof Bathroom){
            System.out.println("In Bathroom");
            Bathroom bathroom=(Bathroom) room;
            bathroom.bath();
        }

    }
}
