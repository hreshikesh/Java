package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.IPL;
import com.xworkz.isarelation.Internal.Tournament;

public class Leage {
    public void century(Tournament tournament){
        tournament.organize();
        tournament.teamsParticipate();
        tournament.scheduleMatches();
        tournament.declareWinner();
        tournament.entertainFans();
        if(tournament instanceof IPL){
            System.out.println("In IPL");
            IPL ipl=(IPL) tournament;
            ipl.trophy();
        }
    }
}
