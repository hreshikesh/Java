package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.Firewall;

public class CyberSecurityFirm {
    private Firewall obj;

    public CyberSecurityFirm(Firewall obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.detectThreat();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}