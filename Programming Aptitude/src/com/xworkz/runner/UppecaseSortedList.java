package com.xworkz.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppecaseSortedList {
    public static void main(String[] args) {
//        Take a list of names: ["Anil", "Sunil", "Ravi", "Ankit", "Suresh", "Ramesh"].
//        Filter names starting with "A".
//                Convert them to uppercase.
//                Print them in alphabetical order.

        List<String> names=new ArrayList<>(Arrays.asList("Anil", "Sunil", "Ravi", "Ankit", "Suresh", "Ramesh"));

        List<String> filterdName=names.stream().filter(p->p.startsWith("A")).
             sorted().collect(Collectors.toList());

        filterdName.forEach(s-> System.out.println(s.toUpperCase()));
    }
}
