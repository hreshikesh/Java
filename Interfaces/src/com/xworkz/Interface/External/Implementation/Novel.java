package com.xworkz.Interface.External.Implementation;

import com.xworkz.Interface.Internal.Rules.Bakery;
import com.xworkz.Interface.Internal.Rules.Book;

public class Novel implements Book {
    @Override
    public void readBook() {
        System.out.println("Reading Novel");
    }

    @Override
    public void writeBook() {
        System.out.println("Writing Novel");
    }

    @Override
    public void publishBook() {
        System.out.println("Publishing Novel");
    }
}
