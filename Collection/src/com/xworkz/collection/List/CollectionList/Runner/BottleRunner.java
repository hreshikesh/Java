package com.xworkz.collection.List.CollectionList.Runner;

import java.util.*;

public class BottleRunner
{
    public static void main(String[] args) {
        List<String> bottleList=new ArrayList<>(Arrays.asList("WaterBottle","SodaBottle","OilBottle","GlassBottle"));
        ListIterator<String> listItems=bottleList.listIterator();
//getting the value of index 1 using get()
        System.out.println(bottleList.get(1));

        listItems.add("Rubber Bottle");
        while ((listItems.hasNext())){
            System.out.println("Bottle List "+listItems.next() );
//            we can add values to list not directle using list reference but by iterator reference
        }

        //added the value rubberbottle

        System.out.println("Bottle List "+bottleList );

    }
}
