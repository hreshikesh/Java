package com.xworkz.collection.Map.MapToList.Runner;

import com.xworkz.collection.Map.MapToList.dto.LaptopDto;

import java.util.*;

public class LaptopRunner {
    public static void main(String[] args) {
        Map<String, LaptopDto> map = new HashMap<>();

        map.put("Dell", new LaptopDto("Dell", "Inspiron 15", 58999.99, 8, 512, "Intel i5", "Windows 11", 1.7, false, "India"));
        map.put("HP", new LaptopDto("HP", "Pavilion x360", 64999.00, 16, 1024, "Intel i7", "Windows 11", 1.8, true, "China"));
        map.put("Lenovo", new LaptopDto("Lenovo", "IdeaPad Slim 5", 49990.50, 8, 256, "AMD Ryzen 5", "Windows 10", 1.4, false, "Vietnam"));
        map.put("Asus", new LaptopDto("Asus", "Vivobook 14", 42999.00, 8, 512, "Intel i3", "Windows 11", 1.5, false, "India"));
        map.put("Acer", new LaptopDto("Acer", "Aspire 7", 57990.00, 16, 512, "AMD Ryzen 7", "Windows 11", 2.1, true, "Taiwan"));
        map.put("Apple", new LaptopDto("Apple", "MacBook Air M2", 114900.00, 8, 256, "Apple M2", "macOS Ventura", 1.2, false, "USA"));
        map.put("MSI", new LaptopDto("MSI", "Modern 15", 61990.00, 16, 512, "Intel i5", "Windows 11", 1.6, false, "China"));
        map.put("Samsung", new LaptopDto("Samsung", "Galaxy Book2", 67999.00, 8, 512, "Intel i7", "Windows 11", 1.55, true, "Korea"));
        map.put("LG", new LaptopDto("LG", "Gram 16", 99999.00, 16, 1024, "Intel i7", "Windows 11", 1.2, true, "South Korea"));
        map.put("Microsoft", new LaptopDto("Microsoft", "Surface Laptop Go", 71999.00, 8, 256, "Intel i5", "Windows 11", 1.1, false, "USA"));

        // All keys and values
        System.out.println("All Keys: " + map.keySet());
        System.out.println("All Values: " + map.values());

        // Check key and value presence
        System.out.println("HP present: " + map.containsKey("HP"));

        // Convert map to list
        List<Map.Entry<String, LaptopDto>> laptopList = new LinkedList<>();
        laptopList.addAll(map.entrySet());


        // Iterator
        ListIterator<Map.Entry<String, LaptopDto>> laptopIterator = laptopList.listIterator();
        System.out.println("=== Using Iterator ===");
        while (laptopIterator.hasNext()) {
            Map.Entry<String, LaptopDto> entry = laptopIterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        // For-each loop
        System.out.println("=== Using for-each loop ===");
        for (Map.Entry<String, LaptopDto> ref : map.entrySet()) {
            System.out.println("Key: " + ref.getKey() + " Value: " + ref.getValue());
        }

        // Stream
        System.out.println("== Using Stream API ===");
        laptopList.stream().forEach(s -> System.out.println("Key: " + s.getKey() + " Value: " + s.getValue()));
    }
}
