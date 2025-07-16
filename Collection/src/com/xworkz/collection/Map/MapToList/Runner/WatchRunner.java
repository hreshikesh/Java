package com.xworkz.collection.Map.MapToList.Runner;

import com.xworkz.collection.Map.MapToList.dto.WatchDto;

import java.util.*;

public class WatchRunner {
    public static void main(String[] args) {

        Map<String, WatchDto> map = new HashMap<>();

        map.put("Rolex", new WatchDto("Rolex", "Submariner", 899999.99, "Black", "Analog", true, "Steel", "Switzerland", 5, 2022));
        map.put("Casio", new WatchDto("Casio", "G-Shock", 9999.00, "Red", "Digital", true, "Resin", "Japan", 2, 2021));
        map.put("Fossil", new WatchDto("Fossil", "Gen 6", 15999.00, "Silver", "Smart", true, "Stainless Steel", "USA", 2, 2023));
        map.put("Titan", new WatchDto("Titan", "Edge", 11999.00, "Blue", "Analog", false, "Leather", "India", 2, 2022));
        map.put("Timex", new WatchDto("Timex", "Expedition", 7999.00, "Brown", "Analog", true, "Leather", "USA", 1, 2021));
        map.put("Seiko", new WatchDto("Seiko", "Prospex", 29999.00, "Green", "Analog", true, "Stainless Steel", "Japan", 3, 2023));
        map.put("Apple", new WatchDto("Apple", "Watch Series 8", 45999.00, "Black", "Smart", true, "Aluminium", "USA", 1, 2023));
        map.put("Boat", new WatchDto("Boat", "Xtend", 2499.00, "Gray", "Smart", false, "Plastic", "India", 1, 2022));
        map.put("Noise", new WatchDto("Noise", "ColorFit Pro", 2999.00, "Navy", "Smart", false, "Plastic", "India", 1, 2023));
        map.put("Daniel Wellington", new WatchDto("Daniel Wellington", "Classic", 12999.00, "White", "Analog", false, "Steel", "Sweden", 2, 2021));

        // Convert Map to List
        List<Map.Entry<String, WatchDto>> watchList = new ArrayList<>(map.entrySet());


        System.out.println("=== Watch List using Iterator ===");
        Iterator<Map.Entry<String, WatchDto>> iterator = watchList.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, WatchDto> entry = iterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
