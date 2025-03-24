package com.xworkz.specifiers.Sport.FootBall;

public class Football {
    public String playerName;
    private int playerAge=21;
    String place;

    public Football(String playerName, int playerAge, String place){
        this.playerName=playerName;
        this.playerAge=playerAge;
        this.place=place;
    }

    private void penalty(){
        System.out.println("Running penalty in football");
    }
    public void goal(){
        System.out.println("Running goal in football");
        System.out.println("Player age:"+playerAge);
        penalty();

    }

    void score(){
        System.out.println("Running score in football");
        System.out.println("Player Name "+this.playerName+" Place"+this.place);
    }

}
