package com.xworkz.steamapi.runner;

import com.xworkz.steamapi.repository.CountryRepository;
import com.xworkz.steamapi.repository.CountryRepositoryImpl;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CountryRunner {
    public static void main(String[] args) {

        CountryRepository countryRepository = new CountryRepositoryImpl();
        Collection<String> countryList = countryRepository.findBy();


        System.out.println("1.print all countries");
        for (String country : countryList) {
            System.out.println("Country Name:" + country);
        }


        System.out.println("2.Stream all countries starting with I");
        countryList.stream().filter((e) -> e.toLowerCase().startsWith("i")).forEach(c -> System.out.println("Country Name :" + c));

        System.out.println("=========================================================");
        System.out.println("3.Stream all countries starting with G");
        countryList.stream().filter((e) -> e.toLowerCase().startsWith("g")).forEach(c -> System.out.println("Country Name: " + c));

        System.out.println("=========================================================");
        System.out.println("4.. Stream all countries ending with a");
        countryList.stream().filter((e) -> e.toLowerCase().endsWith("a")).forEach(c -> System.out.println("Country Name :"));

        System.out.println("=========================================================");
        System.out.println("5.Sort all countries by desc");
        countryList.stream().sorted(Comparator.reverseOrder()).forEach(c -> System.out.println("Country Name :" + c));

        System.out.println("=========================================================");
        System.out.println("6.Sort all countries by asc");
        countryList.stream().sorted().forEach(c -> System.out.println("Country Name :" + c));

        System.out.println("=========================================================");
        System.out.println("7.Stream all countries with more than 6 characters");
        countryList.stream().filter(e -> e.toLowerCase().length() > 6).forEach(c -> System.out.println("Country Name:" + c));

        System.out.println("=========================================================");
        System.out.println("8 Stream all countries with less than 4 characters");
        countryList.stream().filter(e -> e.toLowerCase().length() <= 4).forEach(c -> System.out.println("Country Name:" + c));


        System.out.println("=========================================================");
        System.out.println("9  Stream all countries which contains 'O'  ");
        //collecting the result instead of directly printing
        Collection<String> list = countryList.stream().filter(e -> e.toLowerCase().contains("o")).collect(Collectors.toList());
        for (String country : list) System.out.println("Country Name:" + country);

//map()-> to one type to other
        System.out.println("=========================================================");
        System.out.println("10 Stream all countries which has a character occurrence more than once");
        countryList.stream().filter((e) -> e.toLowerCase()
                        .chars()
                        .anyMatch(value ->
                                e.toLowerCase().indexOf(value) != e.toLowerCase().lastIndexOf(value)))
                .forEach(e -> System.out.println("Country Name: " + e));


        System.out.println("=========================================================");
        System.out.println("11 Stream Reverse all country name");
        countryList.stream().map((c) -> {
            String rev = "";
            for (int i = c.length() - 1; i >= 0; i--) {
                rev = rev + c.charAt(i);
            }
            return rev;//it returns a string so we use map() sincein filter() only boolen is returned
        }).forEach(e -> System.out.println("Country Reverse  Name " + e));

//        for(String country:countryReverse){
//            System.out.println("Country Reverese Name: "+countryReverse);
//        }


        System.out.println("=========================================================");
        System.out.println("12 Stream and find palindrome country");
        countryList.stream().filter((c) -> {
            String rev = "";
            for (int i = c.length() - 1; i >= 0; i--) {
                rev = rev + c.charAt(i);
            }
            return rev.equals(c);
        }).forEach(e -> System.out.println("Country Palindrome " + e));

        System.out.println("============================================================");
        System.out.println("13 Stream and print length of each country");
        countryList.stream().map(c -> c.length()).forEach(e -> System.out.println("Country Count " + e));


    }
}
