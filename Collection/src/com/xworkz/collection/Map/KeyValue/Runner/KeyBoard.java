package com.xworkz.collection.Map.KeyValue.Runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KeyBoard {
    public static void main(String[] args) {
        Map<String ,Integer> keyBoardMap=new HashMap<>();
        keyBoardMap.put("Zebronics",102);
        keyBoardMap.put("Asus",118);
        keyBoardMap.put("hammer",102);
        keyBoardMap.put("HP",134);

        keyBoardMap.forEach((s,i)-> System.out.println(s+" keyboard "+" no of keys "+i));

    }
}
