package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Bag;
import com.xworkz.isarelation.Internal.SkyBag;

public class CarryBag {
    public void bagUp(Bag bag){
        bag.carry();
        bag.zip();
        bag.unzip();
        bag.pouches();
        bag.size();
        if(bag instanceof SkyBag){
            System.out.println("in Skybag");
            SkyBag skyBag=(SkyBag) bag;
            skyBag.durable();
        }
    }
}
