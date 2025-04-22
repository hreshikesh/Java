package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.GameEngine;

public class GameStudio {
    private GameEngine obj;

    public GameStudio(GameEngine obj) {

        this.obj = obj;
    }

    public void use() {
        if (obj != null) {
            obj.renderGraphics();
        } else {
            System.err.println("LawSystem is null");
        }
    }
}