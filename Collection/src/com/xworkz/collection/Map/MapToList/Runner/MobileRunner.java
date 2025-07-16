package com.xworkz.collection.Map.MapToList.Runner;

import com.xworkz.collection.Map.MapToList.dto.MobileDto;

import java.util.*;

public class MobileRunner {
    public static void main(String[] args) {
        Map<String, MobileDto> map = new LinkedHashMap<>();


        map.put("Samsung", new MobileDto("Samsung", "Galaxy S23", 79999.99, 8, 256, "Android", 6.1, true, 3900, "South Korea"));
        map.put("Apple", new MobileDto("Apple", "iPhone 14", 79990.00, 6, 128, "iOS", 6.1, true, 3279, "USA"));
        map.put("OnePlus", new MobileDto("OnePlus", "11R", 39999.00, 12, 256, "Android", 6.74, true, 5000, "China"));
        map.put("Xiaomi", new MobileDto("Xiaomi", "Redmi Note 12 Pro", 24999.00, 8, 128, "MIUI", 6.67, true, 5000, "China"));
        map.put("Realme", new MobileDto("Realme", "Narzo 60", 17999.00, 6, 128, "Android", 6.43, true, 5000, "India"));
        map.put("Vivo", new MobileDto("Vivo", "V27", 32999.00, 8, 256, "Funtouch OS", 6.78, true, 4600, "India"));
        map.put("Oppo", new MobileDto("Oppo", "Reno 10", 38990.00, 8, 256, "ColorOS", 6.7, true, 4600, "India"));
        map.put("Motorola", new MobileDto("Motorola", "Edge 40", 29999.00, 8, 256, "Android", 6.55, true, 4400, "USA"));
        map.put("Google", new MobileDto("Google", "Pixel 7", 59990.00, 8, 128, "Android", 6.3, true, 4355, "USA"));
        map.put("Nothing", new MobileDto("Nothing", "Phone (2)", 44999.00, 12, 256, "Nothing OS", 6.7, true, 4700, "UK"));


        List<Map.Entry<String, MobileDto>> mobileList = new ArrayList<>(map.entrySet());

        // Iterator
        System.out.println("=== Using Iterator ===");
        Iterator<Map.Entry<String, MobileDto>> iterator = mobileList.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, MobileDto> entry = iterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        // For-each loop
        System.out.println("=== Using for-each loop ===");
        for (Map.Entry<String, MobileDto> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        // Stream API
        System.out.println("=== Using Stream API ===");
        mobileList.stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));

    }


}
