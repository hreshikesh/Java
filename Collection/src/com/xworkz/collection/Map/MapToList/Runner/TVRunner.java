package com.xworkz.collection.Map.MapToList.Runner;

import com.xworkz.collection.Map.MapToList.dto.TVDto;

import java.util.HashMap;
import java.util.Map;

public class TVRunner {
    public static void main(String[] args) {
        Map<String, TVDto> map = new HashMap<>();

        map.put("Sony", new TVDto("Sony", "Bravia X74K", 49999, 43, "4K UHD", true, "Google TV", 3, "Black", 2022));
        map.put("Samsung", new TVDto("Samsung", "Crystal 4K", 42999, 43, "4K UHD", true, "Tizen", 2, "Titan Gray", 2023));
        map.put("LG", new TVDto("LG", "UQ7500", 45990, 50, "4K UHD", true, "WebOS", 3, "Dark Iron Gray", 2022));
        map.put("TCL", new TVDto("TCL", "P635", 37990, 43, "4K UHD", true, "Google TV", 2, "Black", 2023));
        map.put("OnePlus", new TVDto("OnePlus", "Y1S Pro", 28999, 43, "Full HD", true, "Android TV", 2, "Black", 2022));
        map.put("Xiaomi", new TVDto("Xiaomi", "Mi TV 5X", 34999, 43, "4K UHD", true, "Android TV", 3, "Black", 2023));
        map.put("VU", new TVDto("VU", "Premium 4K", 31999, 43, "4K UHD", true, "Android TV", 2, "Gray", 2022));
        map.put("Realme", new TVDto("Realme", "Smart TV 4K", 28999, 43, "4K UHD", true, "Android TV", 2, "Black", 2023));
        map.put("Kodak", new TVDto("Kodak", "7XPro", 26999, 40, "Full HD", true, "Android TV", 2, "Black", 2022));
        map.put("Motorola", new TVDto("Motorola", "Revou 2", 39999, 43, "4K UHD", true, "Android TV", 2, "Black", 2023));


        for(Map.Entry<String,TVDto> ref: map.entrySet()){
            System.out.println("Map Key "+ref.getKey()+" Map Values "+ref.getValue());
        }
    }
}

