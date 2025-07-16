package com.xworkz.collection.Map.MapToList.Runner;

import com.xworkz.collection.Map.MapToList.dto.BookDto;

import java.util.*;


public class BookRunner {
    public static void main(String[] args) {
        Map<String, BookDto> map = new HashMap<>();

        map.put("The Alchemist", new BookDto("The Alchemist", "Paulo Coelho", 208, "Fiction", 399.00, true, "English", 1988, "HarperOne", "9780062315007"));
        map.put("Sapiens", new BookDto("Sapiens", "Yuval Noah Harari", 512, "History", 599.00, false, "English", 2011, "Penguin", "9780099590088"));
        map.put("Wings of Fire", new BookDto("Wings of Fire", "A.P.J. Abdul Kalam", 180, "Autobiography", 299.00, true, "English", 1999, "Universities Press", "9788173711466"));
        map.put("Ikigai", new BookDto("Ikigai", "Francesc Miralles", 208, "Self-help", 450.00, false, "English", 2016, "Penguin", "9780143130727"));
        map.put("Rich Dad Poor Dad", new BookDto("Rich Dad Poor Dad", "Robert Kiyosaki", 336, "Finance", 399.00, true, "English", 1997, "Plata Publishing", "9781612681139"));
        map.put("Think and Grow Rich", new BookDto("Think and Grow Rich", "Napoleon Hill", 320, "Motivation", 350.00, false, "English", 1937, "Ballantine", "9780449214923"));
        map.put("Atomic Habits", new BookDto("Atomic Habits", "James Clear", 320, "Productivity", 550.00, true, "English", 2018, "Penguin", "9780735211292"));
        map.put("Do Epic Shit", new BookDto("Do Epic Shit", "Ankur Warikoo", 280, "Motivation", 299.00, false, "English", 2021, "Juggernaut", "9789391165482"));
        map.put("The Secret", new BookDto("The Secret", "Rhonda Byrne", 198, "Self-help", 499.00, true, "English", 2006, "Simon & Schuster", "9781582701707"));
        map.put("Power of Subconscious Mind", new BookDto("Power of Subconscious Mind", "Joseph Murphy", 320, "Spiritual", 399.00, false, "English", 1963, "Penguin", "9780143453604"));
        map.put("Power of Subconscious Mind1" , new BookDto("Power of Subconscious Mind", "Joseph Murphy", 320, "Spiritual", 399.00, false, "English", 1963, "Penguin", "9780143453604"));




        // Convert map to list
        Set<Map.Entry<String, BookDto>> bookList = new HashSet<>(map.entrySet());

        // Iterator
        System.out.println("=== Using Iterator ===");
        Iterator<Map.Entry<String, BookDto>> bookIterator = bookList.iterator();
        while (bookIterator.hasNext()) {
            Map.Entry<String, BookDto> entry = bookIterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        // For-each loop
        System.out.println("=== Using for-each loop ===");
        for (Map.Entry<String, BookDto> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        // Stream API
        System.out.println("=== Using Stream API ===");
        bookList.stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));
    }
}
