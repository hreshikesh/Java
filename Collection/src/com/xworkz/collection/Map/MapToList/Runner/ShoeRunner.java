package com.xworkz.collection.Map.MapToList.Runner;

import com.xworkz.collection.Map.MapToList.dto.ShoeDto;

import java.util.*;

public class ShoeRunner {
    public static void main(String[] args) {
        Map<String, ShoeDto> map = new HashMap<>();

        map.put("Nike", new ShoeDto("Nike", "Air Max", 7999.00, "Black", 9, "Mesh", true, "Running", "Vietnam", 2022));
        map.put("Adidas", new ShoeDto("Adidas", "Ultraboost", 8999.00, "White", 8, "Knit", true, "Running", "Indonesia", 2023));
        map.put("Puma", new ShoeDto("Puma", "RS-X", 6999.00, "Red", 10, "Leather", false, "Casual", "India", 2022));
        map.put("Reebok", new ShoeDto("Reebok", "Nano X", 8499.00, "Blue", 9, "Synthetic", true, "Training", "Vietnam", 2023));
        map.put("Sketchers", new ShoeDto("Sketchers", "Go Walk", 5999.00, "Grey", 8, "Foam", false, "Walking", "China", 2021));
        map.put("New Balance", new ShoeDto("New Balance", "Fresh Foam", 7499.00, "Navy", 9, "Foam", true, "Running", "USA", 2022));
        map.put("ASICS", new ShoeDto("ASICS", "Gel-Kayano", 9499.00, "Orange", 10, "Mesh", true, "Running", "Japan", 2023));
        map.put("Woodland", new ShoeDto("Woodland", "G-40777", 4999.00, "Brown", 11, "Leather", true, "Trekking", "India", 2021));
        map.put("Bata", new ShoeDto("Bata", "Power", 2999.00, "Black", 9, "Canvas", false, "Daily Wear", "India", 2020));
        map.put("Red Tape", new ShoeDto("Red Tape", "RT-902", 3999.00, "Olive", 8, "PU", true, "Casual", "India", 2023));



        List<Map.Entry<String, ShoeDto>> shoesList = new ArrayList<>(map.entrySet());

        System.out.println("=== Shoes List using Iterator ===");
        Iterator<Map.Entry<String, ShoeDto>> iterator = shoesList.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, ShoeDto> entry = iterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
