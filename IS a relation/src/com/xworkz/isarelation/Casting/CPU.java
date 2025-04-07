package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Port;
import com.xworkz.isarelation.Internal.USB;

public class CPU {
    public void attach(Port port){
        port.connect();
        port.transferData();
        port.supplyPower();
        port.type();
        port.compatibility();
        if(port instanceof USB){
            System.out.println("In Usb");
            USB usb=(USB) port;
            usb.charge();
        }
    }
}
