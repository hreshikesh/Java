package com.xworkz.OOPS.TypesOfInheritence.SingleLevel.External;

import com.xworkz.OOPS.TypesOfInheritence.SingleLevel.Internal.Book;

public class NoteBook extends Book {
    @Override
    public void read() {
        System.out.println("Reading Book in NoteBook");
    }
}
