package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.CopperWire;
import com.xworkz.isarelation.Internal.Wire;

public class PG {
    public void extensionWire(Wire wire){
        wire.conductElectricity();
        wire.insulation();
        wire.flexibility();
        wire.length();
        wire.usage();
        if(wire instanceof CopperWire){
            System.out.println("In CopperWire");
            CopperWire copperWire=(CopperWire) wire;
            copperWire.shock();
        }

    }
}
