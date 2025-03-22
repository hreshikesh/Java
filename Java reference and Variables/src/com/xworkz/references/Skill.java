package com.xworkz.references;

public class Skill {
    String skillName;

    Experience[] experience;

    Skill(String skillName,Experience[] experience) {
        this.skillName = skillName;
        this.experience=experience;
    }

    void skillDisplay() {
        System.out.println("Skill name " + skillName);
        for (Experience ref : experience) {
            if (ref != null) {
                ref.experienceDisplay();
            } else System.err.println("pointing to null");
        }
    }
}
