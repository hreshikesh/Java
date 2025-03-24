package com.xworkz.specifiers.Sport.FootBallRunner;
import com.xworkz.specifiers.Sport.FootBall.Ball;
import com.xworkz.specifiers.Sport.FootBall.Football;

public class FoodBallRunner {
    public static void main(String[] args) {

        Football football=new Football("Ronaldo",22,"Potugal");
        Ball ball=new Ball();
        ball.ballName="hardball";
        ball.ballGame(football);
        FootBallGround footBallGround=new FootBallGround();
        footBallGround.groundSize=1500;
        footBallGround.groundDetails();

    }



}
