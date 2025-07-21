package com.xworkz.collection.Map.MapToList.Runner;

import com.xworkz.collection.Map.MapToList.dto.BagDto;

import java.util.*;

public class BagRunner {
    public static void main(String[] args) {
        Map<String, BagDto> map1 = new HashMap<>();

        map1.put("Wildcraft", new BagDto("Wildcraft", "Black", 1599.99, 35, "Nylon", true, "India", 0.7, "YKK", "BackpackWorld"));
        map1.put("Skybags", new BagDto("Skybags", "Blue", 1899.50, 30, "Polyester", false, "India", 0.6, "Metal", "UrbanStyle"));
        map1.put("Safari", new BagDto("Safari", "Red", 2099.00, 40, "PU", true, "India", 0.8, "Plastic", "BagZone"));
        map1.put("American Tourister", new BagDto("American Tourister", "Green", 2799.75, 32, "Leather", true, "China", 0.9, "YKK", "LuggageMart"));
        map1.put("F Gear", new BagDto("F Gear", "Grey", 999.99, 28, "Canvas", false, "India", 0.5, "Plastic", "GearHouse"));
        map1.put("Nike", new BagDto("Nike", "Black", 3499.00, 35, "Polyester", true, "Vietnam", 0.65, "YKK", "SportFit"));
        map1.put("Puma", new BagDto("Puma", "White", 2999.90, 33, "Leather", false, "Thailand", 0.78, "Metal", "ActiveStore"));
        map1.put("Adidas", new BagDto("Adidas", "Orange", 3199.99, 31, "Nylon", true, "Indonesia", 0.72, "YKK", "RunGear"));
        map1.put("Tommy", new BagDto("Tommy", "Blue", 2699.10, 27, "Canvas", false, "USA", 0.59, "Metal", "StylePoint"));
        map1.put("HRX", new BagDto("HRX", "Navy", 2499.75, 34, "PU", true, "India", 0.63, "Plastic", "FitnessPack"));
//All keys and values of map

        System.out.println("All Keys "+map1.keySet());
        System.out.println("All values "+map1.values());
        //check keys and values

        System.out.println(" Nike present:"+map1.containsKey("Nike"));
//        System.out.println("Dto present "+map.containsValue(new BagDto("HRX", "Navy", 2499.75, 34, "PU", true, "India", 0.63, "Plastic", "FitnessPack")));

        //converting to list
        List<Map.Entry<String,BagDto>> bagList=new ArrayList<>(map1.entrySet());
        //iterator
        Iterator<Map.Entry<String, BagDto>> bagIterator = bagList.iterator();

        while (bagIterator.hasNext()) {
            Map.Entry<String, BagDto> entry = bagIterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
        //forloop

        for(Map.Entry<String,BagDto> ref: map1.entrySet()){
            System.out.println("Key "+ref.getKey()+" values "+ref.getValue());

        }
        //stream

        bagList.stream().forEach(s-> System.out.println("Kay"+s.getKey()+" Value "+s.getValue()));

    }
}
