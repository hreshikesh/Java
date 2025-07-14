package com.xworkz.collection.Map.KeyValue.Runner;

import java.util.HashMap;
import java.util.Map;

public class Movie {


    public static void main(String[] args) {
        Map<String ,Float> movieMap=new HashMap<>();
        movieMap.put("Bahibali",200.00f );
        movieMap.put("Dabang",199.99f);
        movieMap.put("Puspha",499.00f);

        movieMap.forEach((s,f)-> System.out.println("Movie name:"+s+" price:"+f));
    }
}
