package com.xworkz.collection.Map.KeyValue.Runner;

import java.util.HashMap;
import java.util.Map;

public class Movie {


    public static void main(String[] args) {
        Map<String ,Float> movieMap=new HashMap<>();
        movieMap.put("Bahubali",200.00f );
        movieMap.put("Dabang",199.99f);
        movieMap.put("Puspha",499.00f);
        movieMap.forEach((S,F)-> System.out.println("Movie name:"+S+" price:"+F));
    }
}
