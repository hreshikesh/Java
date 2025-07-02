package com.xworkz.collection.Arraylist.addclearsize;

import java.util.ArrayList;
import java.util.Collection;

public class Game {
    public static void main(String[] args) {
        Collection<String> games = new ArrayList<>();
//        Adds values to the list
        games.add("pubg");
        games.add("Freefire");
        games.add("ludo King");
        games.add("Carrom");
        games.add("Cricket");
        games.add("Football");
        games.add("Hide and Seek");
        games.add("THe Nun");
        games.add("Candy Crush");
        games.add("Aviator");

        System.out.println("--Games--" + games);
//        gives the current size of list
        System.out.println("Games Size " + games.size());
//         clears the list
        games.clear();
        System.out.println("After clear()");
        System.out.println("Games Size " + games.size());


        System.out.println("-------------------------------------------");

        games.add("GTA V");
        games.add("GTA VI");
        games.add("Froza Horizon");
        games.add("Spiderman");
        games.add("Granny");
        games.add("Stick Man");
        games.add("Purble Palace");
        games.add("Subway Surfer");
        games.add("Temple run");
        games.add("Dr Driving");

        System.out.println("--Games--" + games);
        System.out.println("Games Size " + games.size());


    }


}
