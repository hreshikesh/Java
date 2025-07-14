package com.xworkz.collection.Map.KeyValue.Runner;

import java.util.HashMap;
import java.util.Map;

public class RainRunner {
    public static void main(String[] args) {
        Map<String ,Integer> rainDetails=new HashMap<>();
        rainDetails.put("Bangalore",4);
        rainDetails.put("Mangalore",7);
        rainDetails.put("Hassan",3);

        System.out.println(rainDetails.get("Bangalore"));


        rainDetails.forEach((s, i) -> System.out.println("City "+s+" rainfall "+i) );
    }
}
