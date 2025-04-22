package com.xworkz.useInterface.impl;

import com.xworkz.useInterface.interfaces.GameEngine;

public class UnrealEngineImpl implements GameEngine {
    public void renderGraphics() {
        System.out.println("UnrealEngineImpl is executing renderGraphics.");
    }
}