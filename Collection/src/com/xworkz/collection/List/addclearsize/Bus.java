package com.xworkz.collection.List.addclearsize;

import java.util.ArrayList;
import java.util.Collection;

public class Bus {
    public static void main(String[] args) {
        Collection<String> buses = new ArrayList<>();
        buses.add("Volvo");
        buses.add("Scania");
        buses.add("Ashok Leyland");
        buses.add("Tata");
        buses.add("Mercedes-Benz");
        buses.add("Benz");
        buses.add("marcopolo");
        buses.add("Eicher");
        buses.add("Force Motors");
        System.out.println("--Buses--" + buses);
        System.out.println("Buses Size " + buses.size());

        buses.clear();
        System.out.println("After clear()");
        System.out.println("Buses Size " + buses.size());
        System.out.println("-------------------------------------------");
        buses.add("KING LONG");
        buses.add("SML Isuzu");
        buses.add("Ashok Leyland Lynx");
        buses.add("Tata Starbus");
        buses.add("Volvo 9700");
        buses.add("Scania Interlink");
        buses.add("Mercedes-Benz Citaro");
        buses.add("Benz Sprinter");
        buses.add("marcopolo Paradiso");
        buses.add("Eicher Skyline");
        System.out.println("--Buses--" + buses);
        System.out.println("Buses Size " + buses.size());




    }
}
