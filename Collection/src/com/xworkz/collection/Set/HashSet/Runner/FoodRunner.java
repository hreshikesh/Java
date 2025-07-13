package com.xworkz.collection.Set.HashSet.Runner;

import java.util.*;

public class FoodRunner {

    public static void main(String[] args) {
        Set<Integer> ageSet=new HashSet<>(Arrays.asList(12,22,3444,566));

        Iterator<Integer> ageIterator=ageSet.iterator();

        while (ageIterator.hasNext()){
            System.out.println("Age Details "+ageIterator.next());
        }

//tree set basically orders /sorts the set data uses red blacj tree
        Set<String> nameSet=new TreeSet<>();
        nameSet.add("Ajay");
        nameSet.add("Ullas");
        nameSet.add("Nithish");
        nameSet.add("Chinnu");
        nameSet.add("ponniSelvan");

        nameSet.forEach(e-> System.out.println("Names "+e));
           Iterator iterator= nameSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }


}
