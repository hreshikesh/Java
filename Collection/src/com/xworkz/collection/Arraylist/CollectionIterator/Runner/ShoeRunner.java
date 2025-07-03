package com.xworkz.collection.Arraylist.CollectionIterator.Runner;

import com.xworkz.collection.Arraylist.CollectionIterator.dto.ShoeDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeRunner {
    public static void main(String[] args) {
        Collection<ShoeDto> shoeCollection=new ArrayList<>();
        shoeCollection.add(new ShoeDto("RK Shoe","Mumbai",1200,"4.5","Nike","Black","Leather","10","Sports"));
        shoeCollection.add(new ShoeDto("Footwear Hub","Bangalore",1500,"4.0","Adidas","White","Synthetic","9","Casual"));
        shoeCollection.add(new ShoeDto("Shoe Hub","Mangalore",5200,"3.9","Walkroo","Brown","Synthetic","11","Formal"));
        shoeCollection.add(new ShoeDto("FOOT Hub","Mangalpura",3200,"4.9","Nike","Blue","Rubber","11","Casual"));
        shoeCollection.add(new ShoeDto("Sneaker Spot", "Chennai", 1800, "4.3", "Puma", "Blue", "Mesh", "8", "Running"));
        shoeCollection.add(new ShoeDto("Urban Feet", "Delhi", 2750, "4.6", "Reebok", "Grey", "Synthetic", "9", "Walking"));
        shoeCollection.add(new ShoeDto("Step Up", "Hyderabad", 2300, "4.2", "Skechers", "Black", "Memory Foam", "10", "Training"));
        shoeCollection.add(new ShoeDto("Stride & Style", "Kolkata", 3500, "4.7", "Nike", "Red", "Leather", "9", "Basketball"));
        shoeCollection.add(new ShoeDto("Comfort Walk", "Pune", 1990, "3.8", "Bata", "Brown", "Leather", "7", "Office"));
        shoeCollection.add(new ShoeDto("SoleMates", "Ahmedabad", 2700, "4.4", "Woodland", "Olive", "Suede", "10", "Trekking"));
        shoeCollection.add(new ShoeDto("Fast Track Shoes", "Jaipur", 3100, "4.1", "Fila", "White", "Synthetic", "8", "Casual"));

        Iterator<ShoeDto> shoeIterator=shoeCollection.iterator();
        while(shoeIterator.hasNext()){
            System.out.println(shoeIterator.next());

        }


    }
}
