package com.xworkz.collection.Arraylist.CollectionList.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public class PhoneRunner {
    public static void main(String[] args) {
        List<Long> phoneList=new ArrayList<>();
        phoneList.add(7902837148l);
        phoneList.add(62587951158l);
        phoneList.add(7937028941l);
        phoneList.add(7937028233l);

        ListIterator<Long> phoneIterator=phoneList.listIterator();

        while(phoneIterator.hasNext()){
            System.out.println("Phone Numbers "+phoneIterator.next());
        }

        phoneIterator.add(9846792964l);

        System.out.println("-------------------------------------");

        ListIterator<Long> phoneIterator1=phoneList.listIterator();

        while(phoneIterator1.hasNext()){
            System.out.println("Phone Numbers "+phoneIterator1.next());
        }



    }
}
