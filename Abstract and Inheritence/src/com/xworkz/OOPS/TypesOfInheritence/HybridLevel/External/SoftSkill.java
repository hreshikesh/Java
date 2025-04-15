package com.xworkz.OOPS.TypesOfInheritence.HybridLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.HybridLevel.Internal.Skill;

//child of skill
public class SoftSkill extends Skill {

    @Override
    public void skillUp() {
        System.out.println("Technical Skill Skillup");
    }
}
