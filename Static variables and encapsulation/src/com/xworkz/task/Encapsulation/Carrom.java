package com.xworkz.task.Encapsulation;

public class Carrom {
    private int noOfCoins;
    private String playerName;



    public int getNoOfCoins(){
        return this.noOfCoins;
    }
    void setNoOfCoins(int noOfCoins){
        this.noOfCoins=noOfCoins;
    }

    public String getPlayerName(){
        return this.playerName;
    }
    void setPlayerName(String playerName){
        this.playerName=playerName;
    }
}
