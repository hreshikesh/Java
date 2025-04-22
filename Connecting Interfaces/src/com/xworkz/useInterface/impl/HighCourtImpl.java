package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.LawSystem;

public class HighCourtImpl implements LawSystem {
    public void giveVerdict() {
        System.out.println("HighCourtImpl is executing giveVerdict.");
    }
}