package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.BroadcastAuthority;

public class BbcNewsImpl implements BroadcastAuthority {
    public void broadcastNews() {
        System.out.println("BbcNewsImpl is executing broadcastNews.");
    }
}