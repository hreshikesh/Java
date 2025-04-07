package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.BMTC;
import com.xworkz.isarelation.Internal.Bus;

public class BusRide {
    public void busTime(Bus bus){
        bus.stand();
        bus.seat();
        bus.pass();
        bus.reserved();
        bus.ticket();

        if(bus instanceof BMTC){
            System.out.println("In BMTC");
            BMTC bmtc=(BMTC) bus;
            bmtc.type();
        }

    }
}
