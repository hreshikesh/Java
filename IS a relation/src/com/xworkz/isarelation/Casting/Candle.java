package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Box;
import com.xworkz.isarelation.Internal.MatchBox;

public class Candle {
    public void spark(Box box){
        box.storeItems();
        box.open();
        box.close();
        box.material();
        box.size();
        if(box instanceof MatchBox){
            System.out.println("In Matchbox");
            MatchBox matchBox=(MatchBox) box;
            matchBox.fire();
        }
    }
}
