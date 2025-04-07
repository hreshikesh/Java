package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Heart;
import com.xworkz.isarelation.Internal.Organ;

public class Attack {
    public void failure(Organ organ){
        organ.function();
        organ.bloodSupply();
        organ.regulation();
        organ.growth();
        organ.repair();
        if(organ instanceof Heart){
            System.out.println("in Heart");
            Heart heart=(Heart) organ;
            heart.pump();
        }

    }
}
