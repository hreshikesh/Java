package com.xworkz.streamapi.runner;

import com.xworkz.streamapi.dto.CountryDTO;
import com.xworkz.streamapi.repository.CountryRepository;
import com.xworkz.streamapi.repository.CountryRepositoryImpl;

import java.util.Collection;
import java.util.Optional;

import static java.util.Arrays.stream;

public class CountryRunner {
    public static void main(String[] args) {
        CountryRepository countryRepository=new CountryRepositoryImpl();
        Collection<CountryDTO> country=countryRepository.countryFetch();

        System.out.println("1...... Find all countries");
        country.forEach(countryDTO -> System.out.println(countryDTO));

        System.out.println("2.......Find all countries ending with 'a'");
        country.stream().filter(c->c.getName().toLowerCase().endsWith("a"))
                .forEach(c-> System.out.println("Country Name:"+c.getName()));

        System.out.println("3....... find all countries starting with 'R'");
        country.stream().filter(c-> c.getName().toUpperCase().startsWith("R"))
                .forEach(c-> System.out.println("Country Name:"+c.getName()));


        System.out.println("4..... Find country by pin code");
     country.stream().filter(p->708754==p.getPinCode()).forEach(c-> System.out.println("Country Name "+c.getName()));

        System.out.println("5......Find a optional country by primeMinister");
        Optional<CountryDTO> pm=country.stream().filter(p->"Modi".equalsIgnoreCase(p.getPrimeMinister())).findFirst();
        if(pm.isPresent()){
            System.out.println("Country Name "+pm.get().getName());
        }

        System.out.println("6.....Find all country where primary lang is english");
        country.stream().filter(l->"english".equalsIgnoreCase(l.getPrimaryLang())).forEach(l-> System.out.println("Country name:"+l.getName()));

        System.out.println("7.....Find all countries where mass between");

        country.stream().filter(m->m.getMassInSqKms()>=10000000 && m.getMassInSqKms()<=20000000).forEach(m-> System.out.println("Country Name "+m.getName()));


        System.out.println("8.....Find optional by noOfStates > than");

        country.stream().filter(s->s.getNoOfStates()>14).forEach(s-> System.out.println("Country name "+s.getName()));




    }
}
