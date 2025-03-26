package com.xworkz.task.Encapsulation;

public class CarromRunner {
    public static void main(String[] args) {
        Carrom carrom=new Carrom();
        carrom.setNoOfCoins(19);
        carrom.setPlayerName("Roshan");

        System.out.println("THe player name in main "+carrom.getPlayerName());
        System.out.println("THe no of coins  in main "+carrom.getNoOfCoins());
    }
}
