package com.xworkz.specifiers.Sport.FootBallRunner;

public class FootBallGround {
    private String groundName;
    public int groundSize;

    private void groundNameDisplay(){
        System.out.println("Ground name "+groundName);
    }
    void groundDetails(){
        groundNameDisplay();
        System.out.println("Ground size "+groundSize);
    }
}
