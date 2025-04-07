package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Chess;
import com.xworkz.isarelation.Internal.Game;

public class Practice {
    public void participate(Game game){
        game.play();
        game.pause();
        game.restart();
        game.quit();
        game.saveProgress();
        if(game instanceof Chess){
            System.out.println("in Chess");
            Chess chess=(Chess) game;
            chess.win();
        }

    }
}
