package com.xworkz.collection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Language {
    public static void main(String[] args) {
        Collection<String> languages = new ArrayList<>();
        languages.add("tulu");
        languages.add("Kannada");
        languages.add("Hindi");
        languages.add("English");
        languages.add("Telugu");
        languages.add("Tamil");
        languages.add("Malayalam");
        languages.add("Bengali");
        languages.add("Punjabi");
        languages.add("Gujarati");
        System.out.println("--Languages--" + languages);
        System.out.println("Languages Size " + languages.size());
        languages.clear();
        System.out.println("After clear()");
        System.out.println("Languages Size " + languages.size());
        System.out.println("-------------------------------------------");
        languages.add("Marathi");
        languages.add("Odia");
        languages.add("Assamese");
        languages.add("Urdu");
        languages.add("English");
        languages.add("French");
        languages.add("Russian");
        languages.add("German");
        languages.add("Spanish");
        languages.add("Beary");
        System.out.println("--Languages--" + languages);
    }
}
