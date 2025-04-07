package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.ChiefMinister;
import com.xworkz.isarelation.Internal.Minister;

public class VidhnaSaudha {
    public void fight(Minister minister){
        minister.makePolicies();
        minister.implementLaws();
        minister.attendMeetings();
        minister.representGovernment();
        minister.manageDepartment();
        if(minister instanceof ChiefMinister){
            System.out.println("In ChiefMinister");
            ChiefMinister chiefMinister=new ChiefMinister();
            chiefMinister.duty();
        }
    }
}
