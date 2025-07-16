package com.xworkz.collection.Map.MapToList.Runner;

import com.xworkz.collection.Map.MapToList.dto.CarDto;

import java.util.*;

public class CarRunner {
    public static void main(String[] args) {
        Map<String, CarDto> map = new HashMap<>();

        map.put("Toyota", new CarDto("Toyota", "Fortuner", 2022, 4890000, "Diesel", true, 13, "White", "SUV", 7));
        map.put("Hyundai", new CarDto("Hyundai", "Creta", 2023, 1590000, "Petrol", false, 17, "Red", "SUV", 5));
        map.put("Maruti", new CarDto("Maruti", "Baleno", 2021, 890000, "Petrol", false, 22, "Blue", "Hatchback", 5));
        map.put("Tata", new CarDto("Tata", "Harrier", 2022, 1990000, "Diesel", true, 15, "Black", "SUV", 5));
        map.put("Mahindra", new CarDto("Mahindra", "XUV700", 2023, 2390000, "Diesel", true, 14, "Silver", "SUV", 7));
        map.put("Honda", new CarDto("Honda", "City", 2021, 1390000, "Petrol", true, 18, "Grey", "Sedan", 5));
        map.put("Kia", new CarDto("Kia", "Seltos", 2022, 1790000, "Petrol", true, 16, "Orange", "SUV", 5));
        map.put("Skoda", new CarDto("Skoda", "Slavia", 2023, 1590000, "Petrol", true, 17, "Blue", "Sedan", 5));
        map.put("Volkswagen", new CarDto("Volkswagen", "Virtus", 2022, 1690000, "Petrol", true, 17, "White", "Sedan", 5));
        map.put("Renault", new CarDto("Renault", "Kiger", 2023, 899000, "Petrol", false, 20, "Green", "Compact SUV", 5));


        Set<CarDto> carSet = new HashSet<>(map.values());

        // Iterator
        System.out.println("=== Car Set using Iterator ===");
        Iterator<CarDto> iterator = carSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // For-each loop
        System.out.println("== Car Set using for-each ===");
        for (CarDto car : carSet) {
            System.out.println(car);
        }

        // Stream API
        System.out.println("=== Car Set using Stream API ===");
        carSet.stream().forEach(s-> System.out.println("Model "+s.getModel()));
    }
}
