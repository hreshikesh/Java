package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.BroadcastAuthority;

public class NewsChannel {
    private BroadcastAuthority obj;

    public NewsChannel(BroadcastAuthority obj) {

        this.obj = obj;
    }

    public void use()
    {
        if (obj != null) {
            obj.broadcastNews();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}