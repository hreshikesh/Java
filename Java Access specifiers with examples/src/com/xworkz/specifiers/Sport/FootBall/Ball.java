package com.xworkz.specifiers.Sport.FootBall;

public class Ball {
    public String ballName;

    private void ballColor(){
        System.out.println("Running Ball Color in Ball");
    }

    public void ballGame(Football football){
        System.out.println("running football in ball");
        football.goal();
        football.score();
    }

}
