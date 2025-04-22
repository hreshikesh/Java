package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.MarinePolicy;

public class OceanResearchTeam {
    private MarinePolicy obj;

    public OceanResearchTeam(MarinePolicy obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.studyOcean();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}