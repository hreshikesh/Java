package com.xworkz.collection.List.CollectionIterator.Runner;

import com.xworkz.collection.List.CollectionIterator.dto.LaptopDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LaptopRunner {
    public static void main(String[] args) {
        Collection<LaptopDto> laptopCollection=new ArrayList<>();
        laptopCollection.add(new LaptopDto("Croma","16gb","12%","Asus","Gaming","Mumbai","1TB",1200000,"i7","16gb"));
        laptopCollection.add(new LaptopDto("Reliance","16gb","10%","Asus","Productivity","Mangalore","1TB",100000,"i3","8gb"));
        laptopCollection.add(new LaptopDto("MicroComputer","0gb","2%","Lenovo","Editing","Bangalore","512TB",1500000,"i7","16gb"));
        laptopCollection.add(new LaptopDto("Croma","16gb","12%","Asus","Gaming","Mumbai","1TB",1200000,"i7","16gb"));
        laptopCollection.add(new LaptopDto("Global","8gb","1%","Dell","Productivity","Mangalore","256TB",25000,"amd3","8gb"));
        laptopCollection.add(new LaptopDto("Croma","16gb","12%","Asus","Gaming","Mumbai","1TB",1200000,"i7","16gb"));
        laptopCollection.add(new LaptopDto("Rw Computer","0gb","10%","Asus Rog","Gaming","Mumbai","2TB",2200000,"i9","32gb"));
        laptopCollection.add(new LaptopDto("Reliance","16gb","10%","Asus","Productivity","Mangalore","1TB",100000,"i3","8gb"));
        laptopCollection.add(new LaptopDto("MVC-Computer","0gb","2%","Samsung","Editing","Bangalore","512TB",550000,"i5","8gb"));
        laptopCollection.add(new LaptopDto("Reliance","16gb","12%","MSi","Gaming","Mumbai","1TB",1500000,"i7","16gb"));
        laptopCollection.add(new LaptopDto("Global","8gb","1%","Jio","Browsing","Mumbai","128TB",25000,"i3","4gb"));laptopCollection.add(new LaptopDto("Croma","16gb","12%","Asus","Gaming","Mumbai","1TB",1200000,"i7","16gb"));


        Iterator<LaptopDto> laptopIterator =laptopCollection.iterator();
        while(laptopIterator.hasNext()){
            System.out.println(laptopIterator.next().getLaptopBrand());
            System.out.println("--------------------------------------------------");

        }




    }
}
