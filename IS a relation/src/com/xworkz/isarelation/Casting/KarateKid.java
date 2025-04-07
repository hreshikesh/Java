package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Karate;
import com.xworkz.isarelation.Internal.Skill;

public class KarateKid {
    public void kumite(Skill skill){
        skill.learn();
        skill.improve();
        skill.apply();
        skill.requiresEffort();
        skill.hasLevels();
        if(skill instanceof Karate){
            System.out.println("In Karate");
            Karate karate=(Karate) skill;
            karate.belt();
        }
    }
}
