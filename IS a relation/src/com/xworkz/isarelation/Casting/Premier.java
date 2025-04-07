package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.RCB;
import com.xworkz.isarelation.Internal.Team;

public class Premier {
    public void match(Team team){
        team.play();
        team.train();
        team.compete();
        team.strategize();
        team.celebrate();
        if(team instanceof RCB){
            System.out.println("In Rcb");
            RCB rcb=(RCB) team;
            rcb.win();
        }
    }
}
